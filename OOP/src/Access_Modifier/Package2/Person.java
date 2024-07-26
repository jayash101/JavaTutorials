package Access_Modifier.Package2;

import Access_Modifier.Package1.Student;

public class Person {
    public static void main(String[] args) {
        Student s = new Student();

        // trying to access private data
        // s.id = 123;      // compile time error

        // trying to access public data
        s.faculty = "BIT";

        //trying to access default data
        // s.batch = 2077;     // compile time error

        //trying to access protected data (wrong way)
        // s.major = "Web Development";     // compile time error
    }
}