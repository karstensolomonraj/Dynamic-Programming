import java.util.*;

public class CanConstructMemo {
    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd"))); // true
        System.out.println(canConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "ate"))); // false
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", Arrays.asList("ee", "eee", "eeeeee", "e", "eeeee", "eeeeeeee"))); // false
    }

    public static boolean canConstruct(String target, List<String> wordBank) {
        return canConstruct(target, wordBank, new HashMap<>());
    }

    public static boolean canConstruct(String target, List<String> wordBank, HashMap<String, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return true;

        for (String word : wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                if (canConstruct(suffix, wordBank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }

        memo.put(target, false);
        return false;
    }


    public static boolean Canconstruct(String target,List<String> wordBank){
        return canConstruct(target,wordBank,new HashMap<>());
        
    }
    private static boolean Canconstruct(String target , String []wordBank,HashMap<String,Boolean>memo){
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return true;

        for(String word : wordBank){
            if(target.startsWith(word)){
                String suffix = target.substring(word.length());
                if(Canconstruct(suffix,wordBank,memo)){
                    memo.put(target,true);
                    return true;
                }
            }
        }
        return false;

    }
}
