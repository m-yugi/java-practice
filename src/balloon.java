import java.util.*;
public class balloon {
    public static void main(String[] args){
        int a=0,b=0,l=0,o=0,n=0;

        String s="leetcode";
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)) {
                case 'b' -> b += 1;
                case 'a' -> a += 1;
                case 'l' -> l += 1;
                case 'o' -> o += 1;
                case 'n' -> n += 1;
            }
        }
        l=l/2;
        o=o/2;
        System.out.println(Math.min(b,Math.min(a,Math.min(l,Math.min(o,n)))));
    }
}
