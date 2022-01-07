import java.util.Scanner;
public class encrypt_decrypt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();

        String result="";
        int n=s.length()-1;
        while(n!=0){
            if(s.charAt(n)>48 && s.charAt(n)<57){
                int t=Character.getNumericValue(s.charAt(n));
                System.out.println(t);
                    char sam=s.charAt(n-1);
                    n--;
                    for(int i=1;i<t;i++){
                        result+=sam;
                    }
            }
            result+=s.charAt(n);
            n--;
        }
        System.out.println(result);
    }
}
