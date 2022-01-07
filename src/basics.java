class Solution {
    public boolean canJump(int[] arr) {
        int n=arr.length-1;
        if(n==1 && arr[0]>=1) return true;
        int goal=0;
        while(n>goal){
            if(arr[arr[goal]]!=0 && arr[goal]!=0){
                System.out.println(goal);
                goal+=arr[goal];
            }
            else{
                if(arr[goal]==0){
                    return false;
                }
                else{
                    goal=1;
                    goal++;
                }
            }
        }
        if(goal>=n){
            return true;
        }
        return false;
    }
}
public class basics{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={3,2,1,0,4};
        System.out.println(sol.canJump(nums));
    }
}