package Exception_Handling.throw_block;

public class throw_block {
    static void canVote(int age){
        try{
            if(age < 18){
                throw new Exception("You are not an adult");
            }
            else{
                System.out.println("You can vote");
            }
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        canVote(20);
        canVote(10);
    }
}
