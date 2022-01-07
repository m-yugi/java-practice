import java.util.HashMap;
public class dup2_map {
    public static boolean hello(int[] nums,int k){
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                if(Math.abs(mp.get(nums[i])-i)<=k) return true;
            }
            mp.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3};
        System.out.println(hello(arr,2));
    }
}
