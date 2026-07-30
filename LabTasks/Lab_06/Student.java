class Student {
    private String name;
    private int rollNo;
    private double marks;
    static String universityName = "COMSATS";
    final String department = "Software Engineering";

    Student() {
        name = "";
        rollNo = 0;
        marks = 0;
    }

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getRollNo() {
        return rollNo;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    double getMarks() {
        return marks;
    }

    void setMarks(double marks) {
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 85) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }

    static void changeUniversity(String nName) {
        universityName = nName;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Farhan", 243, 95);
        Student s2 = new Student("Ali", 102, 72);
        
        System.out.println("Student 1: " + s1.getName());
        System.out.println("Roll: " + s1.getRollNo());
        System.out.println("Marks: " + s1.getMarks());
        System.out.println("Grade: " + s1.calculateGrade());
        System.out.println();
        
        System.out.println("Student 2: " + s2.getName());
        System.out.println("Roll: " + s2.getRollNo());
        System.out.println("Marks: " + s2.getMarks());
        System.out.println("Grade: " + s2.calculateGrade());
        
        System.out.println("\nUniversity: " + Student.universityName);
        Student.changeUniversity("COMSATS Lahore");
        System.out.println("New University: " + Student.universityName);
    }
}
