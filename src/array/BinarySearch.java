package array;

/******
 * Parveen D
 * Binary Search
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        binarySearch(arr, 0, arr.length - 1, 45);
        binarySearchUsingLoop(arr, 45);
    }

    private static void binarySearch(int[] arr, int low, int high, int value) {
        if (low > high) {
            System.out.println("Not Found");
            return;
        }
        int mid = low + (high - low) / 2;
        if (value == arr[mid]) {
            System.out.println("Found at " + mid);
            return;
        } else if (value < arr[mid]) {
            binarySearch(arr, low, mid - 1, value);
        } else {
            binarySearch(arr, mid + 1, high, value);
        }
    }

    private static void binarySearchUsingLoop(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (value == arr[mid]) {
                System.out.println("Found at " + mid);
                return;
            } else if (value < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Not Found");
    }

}
