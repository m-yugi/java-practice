import java.util.HashMap;
class helper{
    public int[] sol(int[] nums,int target){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                return new int[]{mp.get(nums[i]),i};
            }
            else{
                mp.put(target-nums[i],i);
            }
        }
        return new int[2];
    }
}
public class twosum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        helper a= new helper();
        int[] arr= a.sol(nums,target);
        for(int i:arr){
            System.out.println(i    );
        }
    }
}