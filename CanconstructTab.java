import java.util.Arrays;

public class CanconstructTab {
    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef", new String[]{"abc","abcd","de","def","ab","cde"}));
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"ee","eeee","e","eeeeeeeeee"}));
        System.out.println(canConstruct("purple", new String[]{"pur","ple","le","pl","pur","rpl"}));
    }
    static boolean canConstruct(String target ,String[] str){
        boolean[] table = new boolean[target.length()+1];
        table[0] = true;
        for (int i = 0; i < target.length(); i++) {
            if(table[i]){
                for(String word : str){
                    if(i+word.length() <= target.length() && target.substring(i,i+word.length()).equals(word)){
                        table[i+word.length()] = true;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(table));
        return table[target.length()];
    }

    
}
