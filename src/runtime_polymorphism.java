class A{
    void run(){
        System.out.println("hello");
    }
}
class B extends A{
    @Override
    void run(){
        System.out.println("hii");
    }
}
public class runtime_polymorphism {
    public static void main(String[] args) {
        B a= new B();
        a.run();
    }
}
