class Animal4{
    public void eat(){
        System.out.println("Eat all foods...");
    }
}

class Dog3 extends Animal4{
    // overriding method
    public void eat(){
        //calling method for parent class
        super.eat();
        System.out.println("Eat all bones...");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.eat();
    }
}