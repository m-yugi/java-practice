import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class helper1{
    public List<List<Integer>> solu(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> arr= new LinkedList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0||(i>0 && nums[i]!=nums[i-1])){
                int lo=i+1,j=nums.length-1,sum= 0-nums[i];
                while(lo<j){
                    if(nums[lo]+nums[j]==sum){
                        arr.add(Arrays.asList(nums[i],nums[lo],nums[j]));
                        while(lo<j&&nums[lo]==nums[lo+1]) lo++;
                        while (lo<j&&nums[j]==nums[j-1]) j--;
                        lo++;
                    j--;
                    }
                    else if(nums[lo]+nums[j]>sum)j--;
                    else lo++;
                }
            }
        }
        return arr;
    }
}
public class sum_3 {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        helper1 a= new helper1();
        List<List<Integer>> ares=a.solu(nums);
        for(int i=0;i<ares.size();i++){
            for(int j:ares.get(i)){
                System.out.println(j);
            }
        }
    }
}
