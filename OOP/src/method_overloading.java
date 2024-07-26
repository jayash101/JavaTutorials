class Sum{
    //Two parameters
    public int sum(int a, int b){
        return a + b;
    }

    //Three parameters
    public int sum(int a, int b, int c){
        return a + b + c;
    }

    //Four parameters
    public int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        Sum s = new Sum();

        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10, 20, 30, 40));
    }
}
