class StaticTest{
    // non-static method
    int multiply(int a, int b){
        return a * b;
    }

    // static method
    static int add(int a, int b){
        return a + b;
    }
}

public class static_method {
    public static void main(String[] args) {
        // calling non-static method
        StaticTest s = new StaticTest();
        System.out.println("5 * 5 = " + s.multiply(5, 5));

        // calling static method
        System.out.println("5 + 5 = " + StaticTest.add(5, 5));
    }
}
