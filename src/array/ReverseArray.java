package array;

/******
 * Parveen D
 * Reverse Search
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        display(arr);
        reverseArray(arr);
        display(arr);
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
