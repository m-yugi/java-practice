import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] arr= new char[26][26];
        for(int i=0;i<25;i++){
            for(int j=0;j<25;j++){
                System.out.println();
 //                var x = alpha[((alpha[i] - 'a') + (alpha[j] - 'a')) % 26];
//                System.out.println(x);
//                arr[i][j]= x;
            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}