import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle t1 = new Rectangle();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter color:");
        t1.color = input.nextLine();
        
        System.out.println("Enter the Length:");
        t1.length = input.nextInt();

        System.out.println("Enter the Width:");
        t1.width = input.nextInt();
        
        t1.display();
        input.close();
    }
}

class Rectangle {
    String color;
    int length;
    int width;

    public void display() {
        System.out.println("");
        System.out.println("===Rectangle Shape Specification===");
        System.out.println("Color is: " + color);
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
    }
}
