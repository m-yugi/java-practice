import java.util.*;
import  java.lang.Object;
public class array_list {
        public static void main(String[] args) {
            ArrayList<Integer> arr= new ArrayList<>();
            arr.add(1);
            Map<Integer,Integer> hm= new HashMap<>();
            hm.put(1,1);
            hm.put(2,1);
            hm.merge(3,1, Integer::sum);
            hm.merge(2,1, Integer::sum);
        }
}
