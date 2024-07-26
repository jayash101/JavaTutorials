// Program to read an input string from the user and write the vowels of that string in VOWEL.txt and consonants in CONSONANT.txt

package File_Handling.Program_3;
import java.util.Scanner;
import java.io.*;

public class Program_3 {
    public static void main(String[] args) throws Exception{
        // take input from user
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = s.nextLine();
        
        FileWriter vowel = new FileWriter("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\Program_3\\Vowel.txt");

        FileWriter consonant = new FileWriter("C:\\Users\\jayas\\OneDrive\\Desktop\\Java Tutorials\\OOP\\src\\File_Handling\\Program_3\\Consonant.txt");

        // Validate each character of the string
        for (int i = 0; i < input.length(); i++){
            char letter = Character.toLowerCase(input.charAt(i));

            // Vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowel.write(letter + " ");
            }
            else{
                consonant.write(letter + " ");
            }
        }

        //close the file writer
        vowel.close();
        consonant.close();

        // close the Scanner object
        s.close();
    }
}
