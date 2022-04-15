import java.util.Arrays;

public class kth_ele {
    public static void main(String[] args) {
        int[] arr= new int[]{7,10,4,20,15};
        int num=4;
        Arrays.sort(arr);
        System.out.println(arr[num-1]);
    }
}
