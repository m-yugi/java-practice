import java.util.Scanner;
public class poly_alpha {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        System.out.println("please enter the message");
        String s=sc.nextLine();
        System.out.println("please enter the key");
        String k=sc.nextLine();
        int j=0;
        for(char i:s.toCharArray()){
            sb.append((char)((((i-'a')+(k.charAt(j)-'a'))%26)+'a'));
            if(j==k.length()-1){
                j=0;
            }
            else{
                j++;
            }
        }
        System.out.println(sb.toString());
    }
}
