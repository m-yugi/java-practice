public class max_subarray {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};
        int maxsub=nums[0];
        int currsum=0;
        for (int num : nums) {
            if (currsum < 0) {
                currsum = 0;
            }
            currsum += num;
            maxsub = Math.max(currsum, maxsub);
        }
        System.out.println(maxsub);
    }
}
