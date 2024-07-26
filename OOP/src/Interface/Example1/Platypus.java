package Interface.Example1;

// Inheriting multiple interfaces
class Platypus implements Bird, Mammal {
    public void fly() {
        System.out.println("This species can fly");
    }

    public void birth() {
        System.out.println("This species can give birth");
    }
}
