import java.util.Arrays;

public class BinarySortZeros4 {

    public static void sort(int[] arr) {
        int pivot = 1;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

        sort(A);

        // print the rearranged array
        System.out.println(Arrays.toString(A));
    }
}
