abstract class Shape {
    protected int lines;
    protected String color;
    protected String fillColor;

    public Shape(int lines, String color, String fillColor) {
        this.lines = lines;
        this.color = color;
        this.fillColor = fillColor;
    }

    abstract void draw();
}

class Circle extends Shape {
    public Circle(int lines, String color, String fillColor) {
        super(lines, color, fillColor);
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    public Square(int lines, String color, String fillColor) {
        super(lines, color, fillColor);
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle extends Shape {
    public Triangle(int lines, String color, String fillColor) {
        super(lines, color, fillColor);
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(1, "Red", "White");
        Shape s2 = new Square(4, "Orange", "Red");
        Shape s3 = new Triangle(3, "Blue", "White");
        s1.draw();
        s2.draw();
        s3.draw();
    }
}
