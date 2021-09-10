import java.util.*;
public class reverse_linklist {
    public static void main(String[] args) {
        int[] head={1,2,3,4,5};
        int num=(head).length;
        int mid=num/2;
        int j=num-1;
        int temp;
        for(int i=0;i<mid;i++) {
            temp = head[i];
            head[i] = head[j];
            head[j] = temp;
            j -= 1;
        }
        System.out.println(Arrays.toString(head));
    }
}
