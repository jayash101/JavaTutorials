class Rectangle2{
    int length, breadth;

    // Parameterized constructor
    public Rectangle2(int l, int b){
        length = l;
        breadth = b;
    }

    public void calculateArea(){
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}

public class params_constructor {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(15, 10);
        r.calculateArea();
    }
}
