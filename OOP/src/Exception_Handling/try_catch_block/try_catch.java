package Exception_Handling.try_catch_block;

public class try_catch {
    public static void main(String[] args) {
        // try block
        try{
            int divide_by_zero = 5 / 0;
            System.out.println("Answer: " + divide_by_zero);
        }
        // catch block
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
