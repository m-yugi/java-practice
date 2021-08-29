import java.util.*;
public class practice {
    public static void main(String[] args){
        //it works for any input
        int[] nums={2,2,1};
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            result=result^nums[i];
        }
        System.out.println(result);
    }
}