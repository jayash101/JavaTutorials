package File_Handling.File_Output_Stream;
import java.io.*;

public class file_output_stream {
    public static void main(String[] args) {
        try{
            FileOutputStream file_output = new FileOutputStream("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hello.txt");

            String str = "My name is Java Bahadur";

            //converting string into bytes array
            byte[] b = str.getBytes();

            file_output.write(b);

            System.out.println("File has been override with new contents.");

            file_output.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
