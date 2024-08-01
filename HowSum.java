import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {
    
    public static void main(String[] args) {
        System.out.println(howSum(7, new int[]{2, 3}, new HashMap<>())); // [3, 2, 2]
        System.out.println(howSum(7, new int[]{5, 3, 4, 7}, new HashMap<>())); // [4, 3] or [7]
        System.out.println(howSum(7, new int[]{2, 4}, new HashMap<>())); // null
        System.out.println(howSum(9, new int[]{2, 3, 5}, new HashMap<>())); // [2, 2, 2, 2] or other combination
    }

    public static List<Integer> howSum(int targetSum, int[] numbers, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;
        
        for (int num : numbers) {
            int remainder = targetSum - num;
            List<Integer> remainderResult = howSum(remainder, numbers, memo);
            if (remainderResult != null) {
                remainderResult = new ArrayList<>(remainderResult); // Clone the list
                remainderResult.add(num);
                memo.put(targetSum, remainderResult);
                return memo.get(targetSum);
            }
        }
        
        memo.put(targetSum, null);
        return null;
    }
}
