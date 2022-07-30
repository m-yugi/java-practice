import java.util.*;
public class set {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 6};
        HashSet<Integer> ar = new HashSet<>();
        for (int i : arr) {
            if (!ar.add(i)) {
                System.out.println(i+ " number exists");
            }
        }
    }
}
