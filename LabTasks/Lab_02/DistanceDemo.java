class Distance {
    private int feet;
    private int inches;

    public Distance() {
        feet = 0;
        inches = 0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void Display() {
        System.out.println("Inches are : " + inches);
        System.out.println("Feet are : " + feet);
    }
}

public class DistanceDemo {
    public static void main(String[] args) {
        Distance t1 = new Distance();
        Distance t2 = new Distance(5, 34);
        
        System.out.println("Constructor 1 (Default constructor):");
        t1.Display();
        System.out.println("");
        
        System.out.println("Constructor 2:");
        t2.Display();
    }
}
