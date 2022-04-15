import java.util.Scanner;
public class mix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()==0){
            System.out.println(0);
        }
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
