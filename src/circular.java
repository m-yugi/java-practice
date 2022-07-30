import java.util.Scanner;
import java.lang.Math;
class hem{
    int data;
    hem next;
    public hem(int val) {
        data = val;
    }
}
public class circular {
    public static void main(String[] args) {
        hem head=null;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        while (m!=0){
            head=newnode(n,head);
            n=sc.nextInt();
            m=sc.nextInt();
        }
        head=newnode(n,head);
        print(head);
    }
    public static hem newnode(int n, hem head) {
        hem temp = new hem(n);
        if(head==null){
            head=temp;
        }
        else{
            hem dummy=head;
            while (dummy.next!=head){
                dummy=dummy.next;
            }
            dummy.next=temp;
        }
        temp.next=head;
        return head;
    }
    public static void print(hem head){
        hem dummy=head;
        do{
            System.out.println(dummy.data);
            dummy=dummy.next;
        }
        while (dummy!=head);
    }
}