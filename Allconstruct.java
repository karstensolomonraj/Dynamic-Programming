import java.util.*;

public class Allconstruct{
    public static void main (String[]args){
        List<String> wordBank1 = List.of("ab","abc","abcd","ef","def");
        System.out.println(allconstruct("abcdef",wordBank1));
    }
    public static List<List<String>> allconstruct(String target ,List<String>wordBank){
        if(target.isEmpty()){
            List<List<String>> baseCase = new ArrayList<>();
            baseCase.add(new ArrayList<>());
            return baseCase;
            
        }
        List<List<String>> finalResults = new ArrayList<>();

        for(String word : wordBank){
            if(target.startsWith(word)){
                String suffix = target.substring(word.length());
                List<List<String>> suffixWays = allconstruct(suffix,wordBank);
                for(List<String> way : suffixWays){
                    List<String> newWay =  new ArrayList<>();
                    newWay.add(word);
                    newWay.addAll(way);
                    finalResults.add(newWay);
                }
            }
        }
        return finalResults;
    }
}