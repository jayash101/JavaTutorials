import java.util.*;

public class sum_and_average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, sum = 0;

        System.out.println("Enter no. of elements you want in an array: ");
        n = s.nextInt();

        System.out.println("Enter all elements you want in an array: ");

        //Declaring new array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of all elements in the array is: " + sum);
        
        float average = sum / (float)n;
        System.out.println("Average of all elements in the array is: " + average);

        s.close();
    }
}
