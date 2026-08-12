import java.time.LocalDate;

class PersonRecord {
    protected String name;
    protected String address;
    protected int number;
    protected String email;

    public PersonRecord() {
        this.name = "Ali";
        this.address = "Comsats Lahore";
        this.number = 123456;
        this.email = "farhan@gmail.com";
    }

    public PersonRecord(String name, String address, int number, String email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number: " + number);
        System.out.println("Email: " + email);
    }
}

class EmployeeRecord extends PersonRecord {
    protected int salary;
    protected LocalDate hdate;

    public EmployeeRecord(String name, String address, int number, String email, int salary, LocalDate hdate) {
        super(name, address, number, email);
        this.salary = salary;
        this.hdate = hdate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Hiring Date: " + hdate);
    }
}

class FacultyMember extends EmployeeRecord {
    protected int hours;
    protected String rank;

    public FacultyMember(String name, String address, int number, String email, int salary, LocalDate hdate, int hours, String rank) {
        super(name, address, number, email, salary, hdate);
        this.hours = hours;
        this.rank = rank;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Office Hours: " + hours);
        System.out.println("Rank: " + rank);
    }
}

class StaffMember extends EmployeeRecord {
    protected String title;

    public StaffMember(String name, String address, int number, String email, int salary, LocalDate hdate, String title) {
        super(name, address, number, email, salary, hdate);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}

public class PersonEmployeeLabTask1 {
    public static void main(String[] args) {
        LocalDate hireDate = LocalDate.of(2023, 1, 15);

        FacultyMember f1 = new FacultyMember("Raza", "Central Park, Lahore", 1234456, "Raza@gmail.com", 65000, hireDate, 12, "Medium");
        StaffMember s1 = new StaffMember("Ali", "Ahmad City, Faisalabad", 567890, "Ali@gmail.com", 20000, hireDate, "Gardner");

        f1.display();
        System.out.println();
        s1.display();
    }
}
