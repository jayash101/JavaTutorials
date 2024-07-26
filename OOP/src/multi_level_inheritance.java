class Animal2{
    String status = "alive";

    void eat(){
        System.out.println("Eating...");
    }
}

class Mammal extends Animal2{
    void birth(){
        System.out.println("Mammal gives birth");
    }
}

class Cat extends Mammal{
    void purr(){
        System.out.println("Cat purrs");
    }
}

public class multi_level_inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.status);
        c.eat();
        c.birth();
        c.purr();
    }
}