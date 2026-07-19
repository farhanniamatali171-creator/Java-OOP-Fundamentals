public class StudentMarks {
    private int mark1, mark2, mark3;

    public StudentMarks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void sum() {
        int total = mark1 + mark2 + mark3;
        System.out.println("The sum is: " + total);
    }

    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks(67, 78, 89);
        s1.sum();
    }
}
