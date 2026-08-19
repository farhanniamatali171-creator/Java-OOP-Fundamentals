abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract boolean isOutstanding();
}

class Student extends Person {
    double cgpa;

    public Student(String name, double cgpa) {
        super(name);
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public boolean isOutstanding() {
        return cgpa > 3.5;
    }
}

class Professor extends Person {
    int numberOfPublications;

    public Professor(String name, int pubs) {
        super(name);
        numberOfPublications = pubs;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int pubs) {
        numberOfPublications = pubs;
    }

    @Override
    public boolean isOutstanding() {
        return numberOfPublications > 50;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person[] list = new Person[2];

        list[0] = new Student("Ali", 3.8);
        list[1] = new Professor("Dr. Ahmed", 40);

        ((Professor) list[1]).setNumberOfPublications(100);

        for (Person p : list) {
            System.out.println(p.getName() + " Outstanding: " + p.isOutstanding());
        }
    }
}
