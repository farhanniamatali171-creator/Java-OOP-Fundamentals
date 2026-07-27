import java.util.Scanner;

public class ArrayStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] marks = new int[10];
        int sum = 0;
        
        System.out.println("Enter 10 array values:");
        for (int i = 0; i < 10; i++) {
            marks[i] = in.nextInt();
        }

        // Initialize lowest and highest with the first element after input
        int lowest = marks[0];
        int highest = marks[0];

        System.out.println("Array is:");
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
            sum += marks[i];

            if (lowest > marks[i]) {
                lowest = marks[i];
            }
            if (highest < marks[i]) {
                highest = marks[i];
            }
        }

        // Fixed average calculation to divide by 10.0 instead of 3.0
        double average = (double) sum / 10.0;

        System.out.println("Average is: " + average);
        System.out.println("Highest marks is: " + highest);
        System.out.println("Lowest marks is: " + lowest);
        
        in.close();
    }
}
