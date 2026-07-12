public class Student {
    String name;
    int age;
    int reg;

    void display() {
        System.out.println("Name is: " + name);
        System.out.println("Registration number is: " + reg);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Farhan";
        s1.reg = 243;
        s1.age = 18;
        s1.display();
    }
}
