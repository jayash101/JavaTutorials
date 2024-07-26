package Interface;

// extending multiple interfaces
interface Line{
    void calculateSides(int number);
}

interface Shapes extends Line{
    void calculateArea(int length, int breadth);

    default void calculateSides(int number) {
        System.out.println("No. of sides: " + number);
    }
}

class Square implements Line, Shapes{
    public void calculateArea(int length, int breadth){
        System.out.println("Area of rectangle: " + (4 * length));
    }
}

class Triangle implements Line, Shapes{
    public void calculateArea(int length, int breadth){
        System.out.println("Area of triangle: " + ((float)1/2 * length * breadth));
    }
}

public class interfaceExample4 {
    public static void main(String[] args) {
        Square s = new Square();
        s.calculateSides(4);
        s.calculateArea(5,5);

        Triangle t = new Triangle();
        t.calculateSides(3);
        t.calculateArea(4, 5);
    }
}
