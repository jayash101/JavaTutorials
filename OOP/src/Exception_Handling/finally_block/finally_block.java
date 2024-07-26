package Exception_Handling.finally_block;

public class finally_block {
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
        //finally block
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
