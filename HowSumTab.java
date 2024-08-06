import java.util.*;
public class HowSumTab {
   public static ArrayList<Integer> howSum(int targetSum,int[] numbers){
    ArrayList<Integer> []table = new ArrayList[targetSum+1];
    table[0] = new ArrayList<>();

    for(int i =0;i<=targetSum;i++){
        if(table[i] != null){
            for(int num : numbers){
                if(i+num<=targetSum){
                    table[i+num] = new ArrayList<>(table[i]);
                    table[i+num].add(num);
                }
            }
        }
    }
    return table[targetSum];
   }

    public static void main(String[] args) {
        System.out.println(howSum(7,new int[]{5,3,4}));
        System.out.println(howSum(8,new int[]{5,3,4,7}));
        System.out.println(howSum(1,new int[]{3}));
    }
}
