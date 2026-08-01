class Address {
    public String city;
    public int street;

    public Address(String city, int street) {
        this.city = city;
        this.street = street;
    }  

    public Address(Address other) {
        this.street = other.street;
        this.city = other.city; 
    }
}

public class StudentAddressDemo {
    private String name;
    private int roll;
    private Address address;

    public StudentAddressDemo(String name, int roll, Address address) {
        this.name = name;
        this.roll = roll;
        this.address = address;
    }

    public StudentAddressDemo(StudentAddressDemo other) {
        this.name = other.name;
        this.roll = other.roll;
        this.address = new Address(other.address); // Deep copy
    }

    public void display() {
        System.out.println("Name: " + name);
        System.0ut.println("Roll: " + roll);
        System.out.println("Address: " + address.city + ", Street " + address.street);
        System.out.println();
    }

    public static void main(String[] args) {
        Address a1 = new Address("Lahore", 9);
        StudentAddressDemo s1 = new StudentAddressDemo("Farhan", 243, a1);
        StudentAddressDemo s2 = new StudentAddressDemo("Farhan", 243, a1); // Shallow copy reference simulation
        StudentAddressDemo s3 = new StudentAddressDemo(s1); // Deep copy

        System.out.println("==== Real Object ====");
        s1.display();

        System.out.println("==== Shallow Copy ====");
        s2.display();

        System.out.println("==== Deep Copy ====");
        s3.display();

        // Modifying original address reference
        a1.city = "Karachi";
        a1.street = 3;

        System.out.println("===== After Modifying Address ======");
        System.out.println("===== Original Object ======");  
        s1.display();

        System.out.println("===== Shallow Copy ======");  
        s2.display();

        System.out.println("===== Deep Copy ======");
        s3.display();
    }
}
