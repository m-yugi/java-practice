import java.util.*;
class shape{
    int length;
    int breath;
    shape(int l,int b){
        this.length=l;
        this.breath=b;
    }
    public void area(){
        System.out.println(length*breath);
    }
}
class rectangle extends shape{
    rectangle(int l,int b){
        super(l,b);
    }
}
public class anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        shape s=new shape(l,b);
        s.area();
        rectangle r=new rectangle(l,b);
        r.area();
    }
}