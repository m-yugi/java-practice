public class fibonnachi {
    public static void main(String[] args) {
        System.out.println(helper(5));
    }
    public static int helper(int n){
        if(n<=1) return n;
        return helper(n-1)+helper(n-2);
    }

}
