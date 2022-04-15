public class max_min {
    public static void main(String[] args) {
        long[] arr= new long[]{3, 2, 1, 56, 10000, 167};
        long max=Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;
        for(long a:arr){
            if(max<a){
                max=a;
            }
            if(min>a){
                min=a;
            }
        }
        System.out.println(max+" "+min);
    }
}
