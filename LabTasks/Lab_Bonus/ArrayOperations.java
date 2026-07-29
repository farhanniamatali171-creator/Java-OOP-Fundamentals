import java.util.Scanner;

public class ArrayOperations {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[8];
    int sum = 0;
    double avg;
    int largest, smallest;

    public ArrayOperations() {
        // Constructor initialization can remain empty or handle defaults
    }

    void input() {
        System.out.println("Enter 8 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // Initialize largest and smallest *after* input is captured
        largest = arr[0];
        smallest = arr[0];
    }

    void sum() {
        sum = 0; // Reset sum to prevent compounding issues if called multiple times
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is: " + sum);
    }

    void average() {
        avg = (double) sum / arr.length;
        System.out.println("Average is: " + avg);
    }

    void larger() {
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println("Largest is: " + largest);
    }

    void smaller() {
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest is: " + smallest);
    }

    void display() {
        input();
        sum();
        average();
        larger();
        smaller();
    }

    public static void main(String[] args) {
        ArrayOperations p = new ArrayOperations();
        p.display();
    }
}
