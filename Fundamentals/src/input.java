import java.util.*;

public class input {
    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = s.nextInt();

        System.out.print("Enter the second number: ");
        num2 = s.nextInt();
        
        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        s.close();
    }
}
