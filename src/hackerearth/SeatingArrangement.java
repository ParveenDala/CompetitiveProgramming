package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/******
 * ParveenDala
 * HackerEarth
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seating-arrangement-1/
 */
public class SeatingArrangement {

    public static void main(String[] args) throws Exception {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        final StringBuilder result = new StringBuilder();
        while (testCases > 0) {
            testCases--;
            final int num = Integer.parseInt(br.readLine());
            if (num % 12 == 0) {
                result.append(num - 11);
            } else {
                int facingSeatNum = 13 - num % 12;
                result.append(facingSeatNum + (num / 12) * 12);
            }
            switch (num % 6) {
                case 0:
                case 1:
                    result.append(" WS\n");
                    break;
                case 2:
                case 5:
                    result.append(" MS\n");
                    break;
                case 3:
                case 4:
                    result.append(" AS\n");
            }
        }
        System.out.println(result);
    }
}