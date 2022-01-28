import java.util.Arrays;

class helper2{
    public int sol(int[] nums,int target){
        int res=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int lo=i+1,hi=nums.length-1;
            while(lo<hi){
                int sum=nums[i]+nums[lo]+nums[hi];
                if(sum>target){
                    hi--;
                }
                else lo++;
                if(Math.abs(sum-target)<Math.abs(res-target)){
                    res=sum;
                }

            }
        }
        return res;
    }
}
public class threesum_closest {
    public static void main(String[] args) {
        int[] arr={-1,2,1,-4};
        int target=1;
        helper2 a= new helper2();
        System.out.println(a.sol(arr,target));
    }
}
