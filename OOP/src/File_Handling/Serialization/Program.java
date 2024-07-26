package File_Handling.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program {
    public static void main(String[] args) throws Exception {
        //Serialization
        Employee e1 = new Employee("Abc", 20 ,"IT");
        Employee e2 = new Employee("Xyz", 23, "HR");

        FileOutputStream file_output = new FileOutputStream("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\Serialization\\employee_info.docx");

        ObjectOutputStream object_output = new ObjectOutputStream(file_output);

        object_output.writeObject(e1);
        object_output.writeObject(e2);

        file_output.close();
        object_output.close();


        //Deserialization
        Employee e3 = null;
        Employee e4 = null;
        FileInputStream file_input = new FileInputStream("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\Serialization\\employee_info.docx");

        ObjectInputStream object_input = new ObjectInputStream(file_input);

        e3 = (Employee) object_input.readObject();
        e4 = (Employee) object_input.readObject();

        file_input.close();
        object_input.close();

        System.out.println("Name: " +e3.name);
        System.out.println("Age: " + e3.age);
        System.out.println("Department: " + e3.department);

        System.out.println("\nName: " + e4.name);
        System.out.println("Age: " + e4.age);
        System.out.println("Department: " + e4.department);
    }
}
