import java.util.*;
public class rotation{
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of test cases");
        for(i=0;i<sc.nextInt();i++){
            System.out.println("enter the size of array");
            int n=sc.nextInt();
            System.out.println("enter the rotation number");
            int d=sc.nextInt();
            int[] arr=new int[n];
            for( i=0;i<n;i++){
                int c=(i+n-d)%n;
                arr[c]=sc.nextInt();
            }
            for(int x: arr){
                System.out.println(x);
            }
        }
    }
}