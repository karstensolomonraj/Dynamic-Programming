import java.util.ArrayList;
import java.util.List;

public class BestSum{
    public static void main(String[]args){
        System.out.println(bestSum(7,new int[]{5,3,4,7}));
        System.out.println(bestSum(8,new int[]{2,3,5}));
        System.out.println(bestSum(10,new int[]{9,4,5}));
    }

    public static List<Integer> bestSum(int targetSum,int[] numbers){
        if(targetSum ==0) return new ArrayList<>();
        if(targetSum<0) return null;

        List<Integer> shortestCombination = null;

        for(int num : numbers){
            int remainder = targetSum-num;
            List<Integer> remainderCombination = bestSum(remainder,numbers);
            if(remainderCombination != null){
                List<Integer> combination = new ArrayList<>(remainderCombination);
                combination.add(num);
                if(shortestCombination == null || combination.size() < shortestCombination.size()){
                shortestCombination = combination;
                }

            }
        }
        return shortestCombination;
    }
}