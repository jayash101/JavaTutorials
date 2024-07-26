package Class_and_Object.Program2;

import java.util.Scanner;

class Rectangle1 {
    int length, breadth;

    public void getData() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length: ");
        length = s.nextInt();

        System.out.println("Enter breadth: ");
        breadth = s.nextInt();

        s.close();
    }

    public void displayArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}
