class PersonNode {
    protected String name;
    protected int id;
    protected int age;

    public PersonNode() {
        this.name = "null";
        this.id = 1;
        this.age = 16;
    }

    public PersonNode(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public void displayInfo() {
        System.out.println("Name is :" + name);
        System.out.println("ID is :" + id);
        System.out.println("Age is :" + age);
    }
}

class StudentChild extends PersonNode {
    protected String program;
    protected int semester;

    public StudentChild(String name, int id, int age, String program, int semester) {
        super(name, id, age);
        this.program = program;
        this.semester = semester;
    }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }
    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Program is :" + program);
        System.out.println("Semester is :" + semester);
    }
}

public class PersonStudentTask2 {
    public static void main(String[] args) {
        StudentChild s1 = new StudentChild("Farhan", 243, 18, "BSSE", 2);
        s1.displayInfo();
    }
}
