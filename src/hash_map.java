import java.io.*;
import java.util.*;

public class hash_map {

    public static void main(String[] args) {
        HashMap<Character,Character> arr=new HashMap<>();
        arr.put('}','{');
        arr.put(']','[');
        arr.put(')','(');
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<s.length();i++){
                if(stack.isEmpty()==false && stack.peek()==arr.get(s.charAt(i))){
                    stack.pop();
                }
                else{
                    stack.add(s.charAt(i));
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}
