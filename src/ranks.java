import java.util.ArrayList;
import java.util.Arrays;

public class ranks {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{5,7,2,9,4,1};
        int[] arr2;
        arr2= new int[]{0};
        arr2=arr;
        Arrays.sort(arr2);
        for(int i:arr2){
            System.out.println(i);
        }
        ArrayList<Integer> res= new ArrayList<>();
        res.add(1);
        res.add(2);
    }
}
