import java.util.Scanner;
public class won {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s=sc.nextLine();
        int ncount=0,tcount=0;
        for(char i:s.toCharArray()){
            if(i=='N'){
                ncount++;
            }
            else {
                tcount++;
            }
        }
        if(ncount>tcount){
            System.out.println("Nutan");
        }
        else{
            System.out.println("Tusla");
        }
    }
}
