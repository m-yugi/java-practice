import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        int[] arr= new int[m+n];
        for(int i=0;i<n+m;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1=arr;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=arr1[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
