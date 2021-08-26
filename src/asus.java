import java.util.*;
public class asus {
    public static void main(String[] args) {
        int x=1001;
        String y=String.valueOf(x);
        StringBuffer b=new StringBuffer(y);
        b.reverse();
        System.out.println(y.equals(String.valueOf(b)));
    }
}