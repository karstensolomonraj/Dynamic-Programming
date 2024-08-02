import java.util.*;

public class Canconstruct {
    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd"))); // true
        System.out.println(canConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "ate"))); // false
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", Arrays.asList("ee", "eee", "eeeeee", "e", "eeeee", "eeeeeeee"))); // false
    }

    public static boolean canConstruct(String target, List<String> wordBank) {
        if (target.equals("")) {
            return true;
        }

        for (String word : wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                if (canConstruct(suffix, wordBank)) {
                    return true;
                }
            }
        }

        return false;
    }
}