package others;

/******
 * Parveen D
 * Fibonacci Series.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series " + fibonacciUsingRecursion(7));
        System.out.println("Fibonacci Series using Loop " + fibonacciUsingLoop(7));
    }

    private static int fibonacciUsingRecursion(int n) {
        if (n <= 1)
            return n;
        return fibonacciUsingRecursion(n - 2) + fibonacciUsingRecursion(n - 1);
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
