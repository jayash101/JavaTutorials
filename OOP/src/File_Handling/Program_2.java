// Program to duplicate each character in a text file and write the output in a separate file using character stream. (Example: bit to bbiitt)

package File_Handling;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Program_2 {
    public static void main(String[] args) throws Exception{

        // Read data from hello.txt
        FileReader fr = new FileReader("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hello.txt");

        // Write data in hi.txt
        FileWriter fw = new FileWriter("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\hi.txt");

        int character;

        while((character = fr.read()) != -1){
            fw.write(character);
            fw.write(character);
        }

        fr.close();
        fw.close();
    }
}
