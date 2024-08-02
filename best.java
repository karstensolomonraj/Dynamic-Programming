import java.util.*;

class best{
    public static void main(String[]args){
        System.out.println(bestsum(7,new int[]{2,1,3,5}));
        System.out.println(bestsum(100,new int[]{20,5}));
    }

    public static List<Integer> bestsum(int targetSum,int[] arr){
        return bestsum(targetSum, arr, new HashMap<>());

    }

    public static List<Integer>bestsum(int targetSum,int arr[],Map<Integer,List<Integer>>map){
        if(map.containsKey(targetSum))
        return map.get(targetSum);

        if(targetSum ==0) return new ArrayList<>();

        if (targetSum<0) return null;

        List<Integer> shortCombination = null;

        for(int num : arr){
            int remainder = targetSum-num;
            List<Integer> remainderList = bestsum(remainder,arr,map);

            if(remainderList !=null ){
                List<Integer> remainderCombination = new ArrayList(remainderList);
                remainderCombination.add(num);
                if(shortCombination == null || remainderCombination.size() < shortCombination.size()){
                    map.put(targetSum,shortCombination);
                    shortCombination = remainderCombination;
                }
            }
        }
        map.put(targetSum,shortCombination);
        return shortCombination;
    }

}