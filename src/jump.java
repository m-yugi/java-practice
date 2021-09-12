import java.util.*;
import java.lang.*;
public class jump{
    public static boolean jump1(int[] nums, int n, int jump){
        if(n==1){
            return true;
        }
        else{
            for(int i=0;i<n;i++){
                jump=Math.max(jump,nums[i]);
                if(jump==0 && i!=n-1) return false;
                jump--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        //runs for any input
        int[] nums={3,2,1,0,4};
        int n=nums.length;
        int jump=0;
        System.out.println(jump1(nums,n,jump));
    }
}
