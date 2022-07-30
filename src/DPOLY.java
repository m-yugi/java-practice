import java.util.ArrayList;
import java.util.Scanner;
public class DPOLY {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=t-1;i>=0;i--){
            int n=sc.nextInt();
            ArrayList<Integer> arr= new ArrayList<>();
            for(int j=0;j<n;j++){
                arr.add(sc.nextInt());
            }
            for(int j:arr){
                System.out.println(j);
            }
        }
    }
}
