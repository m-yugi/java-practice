import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;
public class jump_game {
    public static void main(String[] args) {
        HashMap<Character,Character> hm=new HashMap<>();
        Stack<Character> st= new Stack<>();
        hm.put('(',')');
        hm.put('{','}');
        hm.put('[',']');
        String s="){";
        for(int i=0;i<s.length();i++){
            if (hm.containsKey(s.charAt(i))){
                st.push(hm.get(s.charAt(i)));
            }
            else{
                if(s.charAt(i)==st.peek()){
                    st.pop();
                }
            }
        }
        System.out.println(st.empty());
    }
}