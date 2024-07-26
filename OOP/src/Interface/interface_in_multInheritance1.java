package Interface;

interface Bird{
    void fly();
}

interface Mammal{
    void birth();
}

class Platypus implements Bird, Mammal{
    public void fly(){
        System.out.println("This species can fly");
    }

    public void birth(){
        System.out.println("This species can give birth");
    }
}

public class interface_in_multInheritance1 {
    public static void main(String[] args) {
        Platypus p = new Platypus();
        p.fly();
        p.birth();
    }
}
