import java.util.HashSet;
import java.util.Set;

public class ZeroExits {
    public static boolean hasZero(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(0);
        int sum = 0;
        for (int value : arr) {
            sum += value;
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
            System.out.println(set);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, -6, 3, -1, 4, 2, 7 };
        if (hasZero(arr)) {
            System.out.println("Sub array Exists");
        } else {
            System.out.println("sub array not exists");
        }
    }
}
