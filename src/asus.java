import java.util.*;
public class asus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = x;
        int r = 0;
        while (temp != 0) {
            int r1 = temp % 10;
            r = r * 10 + r1;
            temp = temp / 10;
        }
        if (r == x && x >= 0) {
            System.out.println(true);
        }
        else {
        System.out.println(false);
        }
    }
}