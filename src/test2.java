import java.util.*;
public class test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int i=0,j=n-1,area=0,maxwater=0;
        while(i<j){
            area=(j-i);
            maxwater=Math.max(maxwater,area*Math.min(arr[i],arr[j]));
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(maxwater);
    }
}