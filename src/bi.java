import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class bi {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[32];
        int i=0,count=0,sum=0;
        int n=43261596;
        while(n!=0){
            arr[i]=(n%2);
            n=n/2;
            i++;
        }
        for(int m:arr){
            if(m!=0){
                System.out.println(Math.pow(2,count));
                sum+=(Math.pow(2,count));
            }
            count+=1;
            System.out.println(count);
        }
        //System.out.println(sum);
    }
}
