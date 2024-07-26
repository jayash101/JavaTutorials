package Class_and_Object;

import java.util.*;
class Rectangle1{
    int length, breadth;

    public void getData(){
        Scanner s  = new Scanner(System.in);
        
        System.out.println("Enter length: ");
        length = s.nextInt();

        System.out.println("Enter breadth: ");
        breadth = s.nextInt();

        s.close();
    }

    public void displayArea(){
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class class_and_object2 {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.getData();
        r.displayArea();
    }
}
