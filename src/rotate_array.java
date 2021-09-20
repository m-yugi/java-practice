public class rotate_array {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
    int n=nums.length;
    int k=3;
    k%=n;
    int start=0;
    rev(nums,start,n-1);
    rev(nums,k,n-1);
    rev(nums,start,k-1);
    for(int i:nums){
        System.out.println(i);
    }
}
    public static void rev(int[] nums,int start,int j)
    {
        for(int i=start;i<j;i++){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
        }
    }
}
