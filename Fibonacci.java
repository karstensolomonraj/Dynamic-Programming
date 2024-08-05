
import java.util.Arrays;

public class Fibonacci {
    public static long fibonacci(int n) {
        long[] table = new long[n+3];
        Arrays.fill(table,0);
        table[0] = 0;
        table[1] = 1;
        
        for(int i =0;i<n;i++){
            table[i+1] +=table[i];
            table[i+2] +=table[i];
        }
        return table[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(30));

    }
}
