 class test {

        String model;

        test(String model) {

System.out.println("Vehicle Parameterised Constructor");
 }

}

public class Car extends test {

    Car() {

        System.out.println("Car Simple Constructor");

    }
}

public class vechicle {

    public static void main(String[] args) {

        Car c= new Car();
    }
}