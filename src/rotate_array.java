import java.util.*;
import java.lang.Math;
public class rotate_array {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;
        if(n==k){
            int j=n-1;
            int mid=(n/2);
            for(int i=0;i<mid;i++){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
            for(int i: nums){
             System.out.println(i);
            }
        }
        else{
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                if(i+k>=n){
                    arr[(i-k)-1]=nums[i];
                }
                else{
                    arr[i+k]=nums[i];
                }
            }
            for(int i: arr){
                System.out.println(i);
            }
        }
    }
}
