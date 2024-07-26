class Animal3{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog2 extends Animal3{
    void Bark(){
        System.out.println("Barks...");
    }
}

class Cat2 extends Animal3{
    void Purr(){
        System.out.println("Purrs...");
    }
}

public class hierarchical_inheritance {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.eat();
        d.Bark();

        Cat2 c = new Cat2();
        c.eat();
        c.Purr();
    }
}