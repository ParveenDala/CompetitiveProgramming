package others;

/******
 * Parveen D
 * Sum of n numbers.
 */
public class SumOfnNumbers {
    public static void main(String... args) {
        System.out.println("Sum : " + (findSum(5)));
        System.out.println("Sum using recursion : " + (findSumUsingRecursion(5)));
        System.out.println("Sum using loop : " + (findSumUsingLoop(5)));
    }

    private static int findSumUsingRecursion(int n) {
        if (n == 0)
            return 0;
        else
            return findSumUsingRecursion(n - 1) + n;
    }

    private static int findSumUsingLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static int findSum(int n) {
        return (n * (n + 1)) / 2;
    }

}
