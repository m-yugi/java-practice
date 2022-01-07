import java.util.HashMap;
public class dup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i : arr) {
            res.merge(i,1,Integer::sum);
        }
        for(int i: res.values()) {
            if (i >= 2) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
