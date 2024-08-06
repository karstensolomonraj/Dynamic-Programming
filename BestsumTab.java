import java.util.ArrayList;
public class BestsumTab {
   public static ArrayList<Integer> bestSum(int targetSum,int[] numbers){
    ArrayList<Integer> []table = new ArrayList[targetSum+1];
    table[0] = new ArrayList<>();

    for(int i =0;i<=targetSum;i++){
        if(table[i] != null){
            for(int num : numbers){
                if(i+num<=targetSum){
                    ArrayList<Integer>combination = new ArrayList<>(table[i]);
                    combination.add(num);
                   if (table[i+num] == null || combination.size() < table[i+num].size()){
                    table[i+num] = combination;
                   }
                }
            }
        }
    }
    return table[targetSum];
   }

    public static void main(String[] args) {
        System.out.println(bestSum(7,new int[]{5,3,4,7}));
        System.out.println(bestSum(8,new int[]{5,3,4,7}));
        System.out.println(bestSum(1,new int[]{3}));
    }
}
