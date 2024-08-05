import java.util.*;

public class Countconstructmemo {
    public static void main(String[] args) {
        System.out.println(countConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd"))); // true
        System.out.println(countConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "ate"))); // false
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", Arrays.asList("ee", "eee", "eeeeee", "e", "eeeee", "eeeeeeee"))); // false
    }
    public static int countConstruct(String target,List<String>wordBank){
        return countConstruct(target, wordBank,new HashMap<>());
}

    private static int countConstruct(String target,List<String>wordBank, HashMap<String,Integer>memo){
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return 1;

        int sum =0;
        for(String word : wordBank){
            if(target.startsWith(word)){
                String suffix = target.substring(word.length());
                sum += countConstruct(suffix, wordBank,memo);
            }
        }
        memo.put(target,sum);
        return sum;

    }
}