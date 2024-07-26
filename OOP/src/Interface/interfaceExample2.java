package Interface;

interface Language{
    void name(String name);
}

class ProgrammingLanguage implements Language{
    public void name(String name){
        System.out.println("Programming Language: " + name);
    }
}

public class interfaceExample2 {
    public static void main(String[] args) {
        ProgrammingLanguage p1 = new ProgrammingLanguage();
        p1.name("Java");

        ProgrammingLanguage p2 = new ProgrammingLanguage();
        p2.name("Python");
    }
}
