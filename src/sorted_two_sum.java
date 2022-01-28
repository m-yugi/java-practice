class helpers{
    public int[] sol(int[] nums, int target){
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target) return new int[]{i+1,j+1};
            else if(nums[i]+nums[j]>target) j--;
            else i++;
        }
        return null;
    }
}
public class sorted_two_sum {
    public static void main(String[] args) {
        int[] arr={2,3,4};
        int target=6;
        helpers a= new helpers();
        int[]  arrs=a.sol(arr,target);
        for(int i:arrs){
            System.out.println(i);
        }
    }
}
