import java.util.Scanner;
import java.util.Stack;
public class decode {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        Stack<Character> stack = new Stack<>();
        String s1 = "";
        String s2="";
        String dig="";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)!=']'){
                stack.push(s.charAt(i));
            }
            else{
                while(stack.peek()!='['){
                    s2=stack.pop()+s2;
                }
                System.out.println(s2);
                stack.pop();
                dig=stack.pop()+dig;
                System.out.println(dig);
                for(int j=0;i<Integer.parseInt(dig);i++) {
                    System.out.println(s1);
                    s1 = s2 + s1;
                }
            }
        }
        System.out.println(s1);
    }
}
