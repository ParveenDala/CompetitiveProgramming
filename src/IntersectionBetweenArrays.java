/******
 * Parveen Dala
 * Find the intersection between sorted arrays
 */
public class IntersectionBetweenArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 9, 11, 13, 17};
        int[] arr2 = {0, 1, 6, 7, 10, 13, 18};
        int[] arr3 = {1, 4, 5, 6, 9, 11, 13};
        findIntersection(arr1, arr2, arr3);
    }

    private static void findIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (!(i >= arr1.length || j >= arr2.length || k >= arr3.length)) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr3[k])
                j++;
            else
                k++;
        }
    }
}
