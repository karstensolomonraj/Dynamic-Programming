import java.util.*;

public class Countconstruct {
    public static void main(String[] args) {
        System.out.println(countConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd"))); // true
        System.out.println(countConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "ate"))); // false
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", Arrays.asList("ee", "eee", "eeeeee", "e", "eeeee", "eeeeeeee"))); // false
    }
  public static int countConstruct(String target,List<String>wordBank){
      if(target.equals("")){
          return 1;
      }
      int totalcount =0;
      for(String word : wordBank){
          if(target.startsWith(word)){
              String suffix =target.substring(word.length());
              totalcount += countConstruct(suffix,wordBank);
          }
      }
      return totalcount;
  }
   
}