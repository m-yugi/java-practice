import java.util.*;
public class prac2 {
    public static void main(String[] args) {
        int num=0;
        int vow=0;
        int sol=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the String :");
        String str= sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                num++;
            }
            else if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' ||  str.charAt(i)=='o' || str.charAt(i)=='u' ||str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                vow++;
            } else if (str.charAt(i) == '@' || str.charAt(i) == ';' || str.charAt(i) == ':' || str.charAt(i) == '>' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '<' || str.charAt(i) == ',' || str.charAt(i) == ']' || str.charAt(i) == '[' || str.charAt(i) =='{' || str.charAt(i)=='}'||str.charAt(i)==' ') {
                sol++;
            }
        }
        System.out.println("no of vowels in the given String are :"+vow);
        System.out.println("no of numbers in the given String are :"+num);
        System.out.println("no of symbol in the given String are :"+sol);
    }
}
