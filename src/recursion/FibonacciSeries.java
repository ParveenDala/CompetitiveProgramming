package recursion;

/******
 * Parveen D
 * Fibonacci Series.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci Series " + fibonacciUsingRecursion(n));
        System.out.println("Fibonacci Series using Loop " + fibonacciUsingLoop(n));
        int[] m = new int[n + 1];
        System.out.println("Fibonacci Series using Memoization " + fibonacciUsingMemoization(n, m));
    }

    private static int fibonacciUsingRecursion(int n) {
        if (n <= 1)
            return n;
        return fibonacciUsingRecursion(n - 2) + fibonacciUsingRecursion(n - 1);
    }


    private static int fibonacciUsingMemoization(int n, int[] m) {
        if (n <= 1) {
            m[n] = n;
        } else if (m[n] == 0)
            m[n] = fibonacciUsingRecursion(n - 2) + fibonacciUsingRecursion(n - 1);
        return m[n];
    }

    private static int fibonacciUsingLoop(int n) {
        int first = 0;
        int second = 1;
        int sum;
        for (int i = 2; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

}
