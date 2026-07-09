public class Battery {
    private int capacity;
    private String type;
    // Default constructor
    public Battery() {
        this.capacity = 4000;
        this.type = "Li-ion";
    }
    // Parameterized Constructor
    public Battery(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }
    // Copy Constructor
    public Battery(Battery other) {
        this.capacity = other.capacity;
        this.type = other.type;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return capacity+" " + type;
    }

    public static void main(String[] args) {
        //  Testing Default Constructor
        Battery b1 = new Battery();
        
        //  Testing Copy Constructor (copies values from b1)
        Battery b2 = new Battery(b1);
        
        //  Testing Parameterized Constructor (fixed the missing string argument)
        Battery b3 = new Battery(5000, "Li-Polymer");

        // Printing the objects to see the results
        System.out.println("---------------------------------------------------");
        System.out.println("b1-Default       : " + b1);
        System.out.println("b2-Copy of b1    : " + b2);
        System.out.println("b3-Parameterized : " + b3);
    }
}
