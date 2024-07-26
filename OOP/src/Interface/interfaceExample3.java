package Interface;

interface Animal{
    void name(String name);

    // Default method used if every class have same method body and parameters
    default void isMammal(Boolean answer){
        System.out.println("Still not confirmed");
    }
}

class Dog implements Animal{
    public void name(String name){
        System.out.println("Name : " + name);
    }

    // overrides the default method
    public void isMammal(Boolean answer){
        System.out.println(answer ? "It is a mammal!" : "Not a mammal!");
    }
}

class Snake implements Animal{
    public void name(String name){
        System.out.println("Name : " + name);
    }
}

public class interfaceExample3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name("Lucy");
        d.isMammal(true);

        Snake s = new Snake();
        s.name("Orochi");
        s.isMammal(false);
    }
}
