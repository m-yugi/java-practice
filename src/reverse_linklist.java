import java.util.*;
public class reverse_linklist {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);
        int num = head.size();
        int mid=num/2;
        System.out.println(mid);
        int j=num-1;
        for(int i=0;i<mid;i++){
            int temp= head.get(i);
            head.add(i,head.get(j));
            head.add(j,temp);
            j-=1;
        }
        System.out.println(head);
    }
}
