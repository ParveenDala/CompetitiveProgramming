package hackerearth;

import java.util.Scanner;

/******
 * ParveenDala
 * HackerEarth
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/
 */
public class PrimeNumber {
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        final StringBuilder result = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            int isPrime = 1;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime == 1)
                result.append(i).append(" ");
        }
        System.out.print(result);
    }
}