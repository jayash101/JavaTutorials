package Exception_Handling.throws_block;

public class throws_block {
    static void divide(int num) throws ArithmeticException{
        System.out.println(10 / num);
    }

    public static void main(String[] args) {
        try{
            divide(10);
            divide(0);
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
