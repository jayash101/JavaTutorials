package File_Handling.Serialization;
import java.io.*;

class Employee implements Serializable {
    String name;
    int age;
    String department;

    public Employee(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
