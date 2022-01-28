class node{
    int data;
    node next;
    public  node(int val){
        data=val;
        next=null;
    }
}
public class linked_list {
    public static void print(node head){
         for (node ptr=head;ptr!=null;ptr=ptr.next){
            System.out.println(ptr.data);
        }
    }
    public static void main(String[] args) {
        node head= new node(1);
        node one= new node(2);
        node second= new node(3);
        node three = new node(4);
        head.next=one;
        one.next=second;
        second.next=three;
        three.next=null;
        print(head);
    }
}
