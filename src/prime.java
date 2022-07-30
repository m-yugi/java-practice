import java.lang.Math;
import java.util.Scanner;
import  java.util.ArrayList;
public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                System.out.println("not prime");
            }
        }
        System.out.println("prime");
    }
}
