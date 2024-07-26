package File_Handling.File_Writer;
import java.io.*;

public class file_writer {
    public static void main(String[] args) {
        try{
            FileWriter file_writer = new FileWriter("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hello.txt");

            String str = "Pari, yo timi k bhandai xau?";
            file_writer.write(str);
            System.out.println("File override successfully. Please check your file.");

            file_writer.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
