package array;

/******
 * Parveen D
 * Merge Arrays
 */
public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {3, 8, 16, 20, 25};
        int[] arr2 = {4, 10, 12, 22, 23, 30};
        int[] arr3 = new int[arr1.length + arr2.length];
        merge(arr1, arr2, arr3);
        display(arr1);
        display(arr2);
        display(arr3);
    }

    private static void merge(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length)
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }

        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
