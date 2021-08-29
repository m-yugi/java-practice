import java.util.*;
public class practice {
    public static void main(String[] args){
        //it works for any input
        int[] nums={2,2,1};
        int result=0;
        for (int num : nums) {
            result = result ^ num;
        }
        System.out.println(result);
    }
}