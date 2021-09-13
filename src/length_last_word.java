import java.util.*;
public class length_last_word {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        s = s.trim();
        String arr[] = s.split(" ");
        int len=arr.length;
        String c=arr[len-1];
        System.out.println(c.length());
    }
}
