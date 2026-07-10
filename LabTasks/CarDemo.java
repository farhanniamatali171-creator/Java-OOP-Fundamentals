import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        Car t1 = new Car();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the car brand:");
        t1.brand = input.nextLine();
        
        System.out.println("Enter the car speed:");
        t1.speed = input.nextInt();
        
        System.out.println("Enter the car model:");
        t1.model = input.nextInt();
        
        t1.display();
        input.close();
    }
}

class Car {
    String brand;
    int speed;
    int model;

    public void display() {
        System.out.println("");
        System.out.println("Car name is: " + brand);
        System.out.println("Speed is: " + speed);
        System.out.println("Model is: " + model);
    }
}
