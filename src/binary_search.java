import java.util.*;
public class binary_search {
    public static int binary(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        //runs for any input
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(binary(nums,target));
    }
}
