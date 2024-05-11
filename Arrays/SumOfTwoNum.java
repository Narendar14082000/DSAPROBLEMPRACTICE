import java.util.Arrays;
import java.util.HashMap;

public class SumOfTwoNum {
    // Brute force method
    public static void SumTarget(int[] arr, int target) {
        System.out.println("Pairs ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.printf("(%d,%d) ", arr[i], arr[j]);
                    return;
                }
            }

        }
        System.out.println();
        System.out.println("pairs not found");
    }

    // using Sorting Technic
    public static void findpair(int[] arr, int target) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[low] + arr[high] == target) {
                System.out.printf("pair found (%d,%d) ", arr[low], arr[high]);
                return;
            }
            if (arr[low] + arr[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        System.out.println("pair not found ");

    }

    public static void usingHashMapTech(int[] arr, int target) {
        System.out.println("usingHashMapTech");
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean pairFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.println("(" + arr[map.get(target - arr[i])] + "," + arr[i] + ")");
                pairFound = true;
            }
            map.put(arr[i], i);
        }
        if (!pairFound) {
            System.out.println("Pair not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
        // SumTarget(arr, target);
        // findpair(arr, target);
        usingHashMapTech(arr, target);
    }
}
