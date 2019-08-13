package recursion;

/******
 * Parveen D
 * Power of number.
 */
public class PowerOfNumber {
    public static void main(String... args) {
        System.out.println("Power of number : " + (powerOfNumber(2, 10)));
    }

    private static int powerOfNumber(int m, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return powerOfNumber(m * m, n / 2);
        else
            return m * powerOfNumber(m * m, (n - 1) / 2);
    }
}
