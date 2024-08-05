
import java.util.Arrays;

public class Fibonacci {
    public static long fibonacci(int n) {
        long[] table = new long[n + 3];
        Arrays.fill(table, 0);
        table[0] = 0;
        table[1] = 1;

        for (int i = 0; i <= n; i++) {
            table[i + 1] += table[i];
            table[i + 2] += table[i];
        }

        return table[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(4));  // Output: 3
        System.out.println(fibonacci(5));  // Output: 5
        System.out.println(fibonacci(6));  // Output: 8
        System.out.println(fibonacci(50)); // Output: 12586269025
    }
}
