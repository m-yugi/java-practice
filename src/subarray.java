class sum{
    public int maxSubArray(int[] input2) {
        int max = input2[0];
        int sum = input2[0];

        for (int i = 1; i < input2.length; i++) {
            sum = Math.max(input2[i], input2[i] + sum);
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

}
public class subarray {
    public static void main(String[] args) {
        sum s=new sum();
        int[] arr={3,-1,2};
        System.out.println(s.maxSubArray(arr));
    }
}
