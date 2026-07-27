public class StudentProfile {
    static String universityName = "COMSATS";
    static String courseName = "Object Oriented Programming";
    static int studentCount = 0;
    
    String name;
    int rollNo;
    double marks;

    final int MAX_MARKS = 100;
    final int PASSING_MARKS = 50;

    StudentProfile(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        studentCount++;
    }

    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("University: " + universityName);
        System.out.println("----------------------");
    }

    static void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + studentCount);
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    final void showMaxMarks() {
        System.out.println("Max Marks: " + MAX_MARKS);
        System.out.println("Passing Marks: " + PASSING_MARKS);
    }

    public static void main(String[] args) {
        StudentProfile s1 = new StudentProfile("Ali", 101, 85);
        StudentProfile s2 = new StudentProfile("Ahmed", 102, 75);
        StudentProfile s3 = new StudentProfile("Sara", 103, 65);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
        
        StudentProfile.displayUniversity();

        StudentProfile.changeUniversityName("FAST University");
        System.out.println("\nAfter Changing University Name:");
        StudentProfile.displayUniversity();
        
        s1.showMaxMarks();
    }
}
