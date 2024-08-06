
public class countConstructTab {
    public static void main(String[] args) {
        System.out.println(countConstruct("abcdef", new String[]{"abc","abcd","de","def","ab","cde"}));
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"ee","eeee","e","eeeeeeeeee"}));
        System.out.println(countConstruct("purple", new String[]{"pur","ple","le","pl","pur","rpl"}));
    }
    static int countConstruct(String target ,String[] str){
        int arr[]  = new int[target.length()+1];
        arr[0] = 1;
        for (int i = 0; i < target.length(); i++) {
            
                for(String word : str){
                    if(i+word.length() <= target.length() && target.substring(i,i+word.length()).equals(word)){
                        arr[i+word.length()] += arr[i];
                    }
                }
        }
        
        return arr[target.length()];
    }

    
}
