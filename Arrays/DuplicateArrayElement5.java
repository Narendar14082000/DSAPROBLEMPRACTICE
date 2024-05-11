public class DuplicateArrayElement5 {
    // public static void dupElement(int[] arr) {
    // int element = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // element = arr[i];
    // }
    // }
    // System.out.println(element + " ");
    // }

    // }

    public static int findDup(int[] arr) {
        boolean[] visited = new boolean[arr.length + 1];
        for (int value : arr) {
            if (visited[value]) {
                return value;
            }
            visited[value] = true;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4 };
        // dupElement(arr);
        System.out.println(findDup(arr));
    }
}
