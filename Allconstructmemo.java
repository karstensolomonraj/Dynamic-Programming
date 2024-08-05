import java.util.*;

public class Allconstructmemo{
    public static void main (String[]args){

        System.out.println(allConstruct("purple", Arrays.asList("purp", "p", "ur", "le", "purpl")));
    }

    public static List<List<String>>allConstruct(String target,List<String>wordBank){
        return allConstruct(target, wordBank,new HashMap<>());
    }
    private static List<List<String>> allConstruct(String target ,List<String>wordBank, HashMap<String, List<List<String>>> memo){
        if(memo.containsKey(target)) return memo.get(target);
        if(target.isEmpty()){
            List<List<String>> baseCase = new ArrayList<>();
            baseCase.add(new ArrayList<>());
            return baseCase;
            
        }
        List<List<String>> finalResults = new ArrayList<>();

        for(String word : wordBank){
            if(target.startsWith(word)){
                String suffix = target.substring(word.length());
                List<List<String>> suffixWays = allConstruct(suffix,wordBank,memo);
                List<List<String>> targetWays = new ArrayList<>();
                for(List<String> way : suffixWays){
                    List<String> newWay =  new ArrayList<>(way);
                    newWay.add(0,word);
                    targetWays.add(newWay);
                    
                }
                finalResults.addAll(targetWays);
            }
        }
        memo.put(target,finalResults);
        return finalResults;
    }
}