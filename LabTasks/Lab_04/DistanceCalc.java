public class DistanceCalc {
    private int feet;
    private int inches;

    public DistanceCalc() {
        inches = 0;
        feet = 0;
    }

    public DistanceCalc(int inches, int feet) {
        this.inches = inches;
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public DistanceCalc add(DistanceCalc a, DistanceCalc b) {
        DistanceCalc ds = new DistanceCalc(this.inches + a.inches + b.inches, this.feet + a.feet + b.feet);
        return ds;
    }

    public void display() {
        System.out.println("Inches: " + inches + " | Feet: " + feet);
    }

    public static void main(String[] args) {
        System.out.println("Distance 1 (Default):");
        DistanceCalc d1 = new DistanceCalc();
        d1.display();

        System.out.println("\nParameterized Constructor & Addition:");
        DistanceCalc d2 = new DistanceCalc(5, 6);
        DistanceCalc d3 = new DistanceCalc(5, 6);
        DistanceCalc d4 = new DistanceCalc(5, 6);
        
        DistanceCalc d5 = d2.add(d3, d4);
        d5.display();
    }
}
