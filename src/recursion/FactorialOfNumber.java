package recursion;

/******
 * Parveen D
 * Factorial of number.
 */
public class FactorialOfNumber {
    public static void main(String... args) {
        System.out.println("Factorial using recursion : " + (factorialUsingRecursion(5)));
        System.out.println("Factorial using loop : " + (factorialUsingLoop(5)));
    }

    private static int factorialUsingRecursion(int n) {
        if (n <= 1)
            return 1;
        else
            return factorialUsingRecursion(n - 1) * n;
    }

    private static int factorialUsingLoop(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
