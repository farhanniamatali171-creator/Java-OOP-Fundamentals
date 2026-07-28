import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] arr1 = new double[3][3];
        double[][] arr2 = new double[3][3];

        System.out.println("Enter array1 (3x3):");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = in.nextDouble();
            }
        }

        System.out.println("Enter array2 (3x3):");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = in.nextDouble();
            }
        }

        System.out.println("\nSum of arrays:");
        for (int i = 0; i < arr1.length; i++) {
            // Print row of arr1
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print(" + ");
            
            // Print row of arr2
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print(" = ");
            
            // Print row sum (Fixed: added arr1[i][j] + arr2[i][j])
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
