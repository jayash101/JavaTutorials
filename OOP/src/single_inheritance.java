class Animal{
    String status = "alive";

    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void Bark(){
        System.out.println("Barks....");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.status);
        d.eat();
        d.Bark();
    }
}
