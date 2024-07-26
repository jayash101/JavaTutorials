package Exception_Handling.creating_exception_class;

class InvalidAgeException extends Exception{
    public  InvalidAgeException(String s){
        super(s);
    }
}

public class creating_exception_class {
    static void check_age(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("You are not eligible to vote");
        }
        else{
            System.out.println("You are permitted to vote");
        }
    }

    public static void main(String[] args) {
        try{
            check_age(20);
            check_age(10);
        }
        catch (InvalidAgeException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
