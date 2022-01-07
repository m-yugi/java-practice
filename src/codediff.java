import java.util.HashSet;

public class codediff {
    public static char helper(String s, String t){
        if(s.length()<=0) return t.charAt(0);
        HashSet<Character> hs= new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(hs.add(t.charAt(i))) return t.charAt(i);
        }
        return ' ';
    }
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(helper(s,t));
    }
}
