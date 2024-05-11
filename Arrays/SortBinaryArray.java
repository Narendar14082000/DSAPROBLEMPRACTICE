import java.util.*;

public class SortBinaryArray {
    // Approach-1
    public static void sort(int[] array) {
        int pivot = 1;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                swap(array, i, j);
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // appoarch2
    public static void sort1(int[] arr) {
        int k = 0;
        for (int i : arr) {
            if (i == 0) {
                arr[k++] = 0;
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[k++] = 1;
        }
    }

    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

        // sort(A);
        sort1(A);

        // print the rearranged array
        System.out.println(Arrays.toString(A));
    }

}
