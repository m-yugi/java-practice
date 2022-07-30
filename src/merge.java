import java.util.Arrays;
public class merge {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0},6,new int[]{2,5,6},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(i<m-n){
            if(nums2[0]<nums1[i]){
                int temp=nums2[0];
                nums2[0]=nums1[i];
                nums1[i]=temp;
            }
            Arrays.sort(nums2);
            i++;
        }
        while(i<(m) && j<m){
            nums1[i]=nums2[j];
            j++;
            i++;
        }
        for (int k:nums1){
            System.out.print(k);
        }
        System.out.println();
        for (int l:nums2){
            System.out.print(l);
        }
    }
}
