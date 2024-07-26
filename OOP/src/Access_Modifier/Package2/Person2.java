package Access_Modifier.Package2;

import Access_Modifier.Package1.Student;

public class Person2 extends Student {
    public static void main(String[] args) {
        // trying to access protected data (right way)
        Person2 p = new Person2();
        p.major = "Web Development";
    }
}