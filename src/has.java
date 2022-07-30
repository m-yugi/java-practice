import java.util.Scanner;
import java.util.ArrayList;
public class has {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int negcount=0,poscount=0,zero=0;
        ArrayList<Integer> arr= new ArrayList<>();
        while (sc.hasNextInt()){
            int temp= sc.nextInt();
            arr.add(temp);
        }
        for(int i:arr){
            if(i<0) negcount++;
            else if (i==0) zero++;
            else poscount++;
        }
        System.out.println("positives : "+poscount+"\n"+"zeros : "+zero+"\n"+"negatives : "+negcount);
    }
}
