package recursion;

import java.util.HashSet;
import java.util.Set;

/******
 * Parveen D
 * Find pair with sum.
 */
public class FindPairWithSum {
    public static void main(String... args) {
        int[] arr = {6, 2, 9, 4, 5, 6};
        int target = 11;
        //findPair(arr, target);
        findPairWithUnsorted(arr, target);
    }

    private static void findPair(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                return;
            } else if (sum < target)
                i++;
            else {
                j--;
            }
        }
        System.out.println("Not Found");
    }


    private static void findPairWithUnsorted(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println(num + " + " + (target - num) + " = " + target);
                return;
            } else {
                set.add(target - num);
            }
        }
        System.out.println("Not Found");
    }

}
