class Shape{
    public void shape(){
        System.out.println("print the shape of a given");
    }
    static class Triangle extends Shape{
        public void shape(int l , int h){
            System.out.println(1/2*l*h);
        }
        //        multiple inheritance = while will extends from sub class
//static class equilateral's  extends  triangle {
//            public void shape(int l , int h){
//                System.out.println(1/2*l*h);
//            }
//    heretical inheritance = every sub class is derived from parent class
       static class Circle extends Shape{
            public void shape(int r){
                System.out.println(3.14*r*r);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Shape.Triangle t= new Shape.Triangle();
        t.shape(5,4);
        Shape.Triangle.Circle c= new Shape.Triangle.Circle();
        c.shape(5);
    }
}