import java.util.*;

public class Canconstruct{
    public static void main(String[]args){
        System.out.println(canConstruct("abcdef",Arrays.asList("ab","cde","cdef")));
        System.out.println(canConstruct("skateboard",Arrays.asList("ska","te","board")));
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeff",Arrays.asList("ee","eeee","eeee")));
    }


    public static boolean canConstruct(String target,List<String>wordbank){
        if(target.equals("")){
            return true;
        }

        for(String word : wordbank){
         if(target.startsWith(word)){
            String suffix = target.substring(word.length());
            if(canConstruct(suffix,wordbank)){
                return true;
            }
         }
    }
    return false;
}
    }
    