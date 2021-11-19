import java.util.Scanner;
public class left_rotate {
    public static void reverse(int[] arr,int start,int end){
        for(int i=start;i<end;i++){
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr,m,n-1);
        reverse(arr,0,m-1);
        reverse(arr,0,n-1);
        for(int i: arr){
            System.out.println(i);
        }
    }

}
