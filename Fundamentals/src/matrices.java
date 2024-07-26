import java.util.*;

public class matrices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = s.nextInt();

        System.out.println("Enter number of columns: ");
        int columns = s.nextInt();

        // Declaring matrix
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        // Inputting elements for first matrix
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }

        // Inputting elements for second matrix
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = s.nextInt();
            }
        }

        // Performing addition of matrices
        System.out.println("Addition of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Showing the result matrix
        System.out.println("Resultant matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
