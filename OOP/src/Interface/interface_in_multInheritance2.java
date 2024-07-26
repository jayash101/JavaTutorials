package Interface;

class Frontend{
    public void responsive(String language){
        System.out.println(language + " can be used as frontend");
    }
}

interface Backend{
    void connect_server(String language);
}

class Languages extends Frontend implements Backend{
    public void connect_server(String language){
        System.out.println(language + " can be used as backend");
    }
}

public class interface_in_multInheritance2 {
    public static void main(String[] args) {
        Languages l = new Languages();
        l.connect_server("Java");
        l.responsive("Java");
    }
}
