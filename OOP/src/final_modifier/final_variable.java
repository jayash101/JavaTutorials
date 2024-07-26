package final_modifier;

public class final_variable {
    public static void main(String[] args) {
        // create a final variable
        final int age = 20;

        // try to change the final variable
        // age = 25;  --> shows compilation error
        System.out.println("Age: " + age);
    }
}