package File_Handling;
import java.io.*;

public class file_input_stream {
    public static void main(String[] args) {
        try{
            FileInputStream file_input = new FileInputStream("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hello.txt");
            int i;
            while((i = file_input.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
