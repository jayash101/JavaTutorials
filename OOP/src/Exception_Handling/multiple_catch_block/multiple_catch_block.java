package Exception_Handling.multiple_catch_block;

public class multiple_catch_block {
    public static void main(String[] args) {
        try{
            // array of max size 10
            int array[] = new int[10];
            array[100] = 30/0;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
