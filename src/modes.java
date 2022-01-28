import java.util.HashMap;

public class modes {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.merge(1,1,Integer::sum);
        int[] arr= new int[10];{
            for (Integer integer : mp.keySet()) {
                arr[integer]=mp.get(integer);
            }
        };
    }
}
