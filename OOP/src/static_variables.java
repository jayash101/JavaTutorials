class StaticTest2{
    // non-static variable
    int max = 10;

    // static variable
    static int min = 5;
}

public class static_variables {
    public static void main(String[] args) {
        // accessing non-static variable
        StaticTest2 s = new StaticTest2();
        System.out.println("Max-value: " + s.max);

        // accessing static variable
        System.out.println("Min-value: " + StaticTest2.min);
    }
}