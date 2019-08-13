package recursion;

/******
 * Parveen D
 * Taylor Series.
 */
public class TaylorSeries {
    public static void main(String[] args) {
        System.out.println("Taylor Series: " + taylorSeries(2, 10));
        System.out.println("Taylor Series 2 : " + taylorSeries2(2, 10));
    }

    private static int taylorSeries(int x, int n) {
        if (n == 0)
            return 1;
        else
            return (pow(x, n) / fact(n)) + taylorSeries(x, n - 1);
    }

    private static int pow(int x, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return pow(x * x, n / 2);
        else
            return x * pow(x * x, (n - 1) / 2);
    }

    private static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return fact(n - 1) * n;
    }

    static int p = 1;
    static int f = 1;

    private static int taylorSeries2(int x, int n) {
        if (n == 0)
            return 1;
        else {
            return taylorSeries2(x, n - 1) + ((p *= x) / (f *= n));
        }
    }

}
