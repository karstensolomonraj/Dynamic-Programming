public class CanSum {
    public static boolean canSum(int targetSum,int[] numbers){
        boolean table[] = new boolean[targetSum+1];
        for(int i =0 ;i<=targetSum;i++){
            if(table[i]){
                for(int num : numbers){
                    if(i+num<=targetSum){
                        table[i+num] = true;
                    }
                }
            }
        }
        return table[targetSum];

    }
    
    public static void main(String[] args) {
        System.out.println(canSum(7,new int[]{5,3,4,7}));
        System.out.println(canSum(8,new int[]{5,3,4,7}));
        System.out.println(canSum(1003,new int[]{3}));
    }
    }

