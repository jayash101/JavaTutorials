package Interface;

// interface
interface Polygon{
    void calculateArea(int length, int breadth);
    // public by default
}

// implementing interface
class Rectangle implements Polygon{
    // implementing abstract methods
    public void calculateArea(int length, int breadth){
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

// main program
public class interfaceExample1{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calculateArea(10, 5);
    }
}