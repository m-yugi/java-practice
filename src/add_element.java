import java.util.Scanner;
import java.lang.Math;
class ele{
    int data;
    ele next;
    public ele(int val) {
        data = val;
        next=null;
    }
}
public class add_element {
    public static void main(String[] args) {
        ele head=null;
        int max=Integer.MIN_VALUE;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while (n>=0){
            head=newnode(n,head);
//            head=nodupe(n,head);
            max=Math.max(max,n);
            n=sc.nextInt();
        }
//        head=atbig(head);
//        print(head);
        System.out.println(max);
    }
    public static ele newnode(int n, ele head) {
        ele temp = new ele(n);
        if(head==null){
            head=temp;
        }
        else{
            ele dummy=head;
            while (dummy.next!=null){
                dummy=dummy.next;
            }
            dummy.next=temp;
        }
        return head;
    }
    public static void print(ele head){
        ele dummy=head;
        while (dummy!=null){
            System.out.println(dummy.data);
            dummy=dummy.next;
        }
    }
    public static ele atbig(ele head){
        head=head.next;
        return head;
    }
    public static ele nodupe(int n,ele head){
        ele temp= new ele(n);
        if(head==null){
            head=temp;
        }
        else{
            ele dummy =head;
            while(dummy.next!=null){
                if(dummy.data==n){
                    break;
                }
                dummy=dummy.next;
            }
            if(dummy.data!=n){
                dummy.next=temp;
            }
        }
        return head;
    }
}