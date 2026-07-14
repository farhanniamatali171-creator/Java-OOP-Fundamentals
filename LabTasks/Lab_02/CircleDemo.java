class Circle {
    private double radius;

    // Default Constructor
    public Circle() {
        this.radius = 2.0;
    }

    // Parameterized Constructor
    public Circle(double ra) {
        this.radius = ra;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius; 
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle t1 = new Circle();
        Circle t2 = new Circle(5.0);
        
        System.out.println("Circumference is : " + t1.circumference());
        System.out.println("Circumference is : " + t2.circumference());
    }
}
