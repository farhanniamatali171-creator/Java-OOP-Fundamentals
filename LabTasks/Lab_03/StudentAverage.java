public class StudentAverage {
    private String name;
    private int[] resultArray;

    public StudentAverage(String name, int[] marks) {
        this.name = name;
        this.resultArray = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : resultArray) {
            sum += mark;
        }
        return sum / 5.0;
    }

    public static void main(String[] args) {
        StudentAverage s1 = new StudentAverage("Farhan", new int[]{85, 90, 78, 92, 88});
        StudentAverage s2 = new StudentAverage("Hamza", new int[]{70, 65, 80, 75, 72});

        System.out.println(s1.name + " Average: " + s1.calculateAverage());
        System.out.println(s2.name + " Average: " + s2.calculateAverage());
    }
}
