package others;

/******
 * Parveen D
 * Find pair with sum.
 */
public class FindPairWithSum {
    public static void main(String... args) {
        int[] arr = {2, 2, 3, 4, 5, 6};
        int target = 11;
        findPair(arr, target);
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

}
