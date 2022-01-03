// Java Program to illustrate Reading from FileReader
// using BufferedReader Class
 
// Importing input output classes
import java.io.*;
 
// Main class
public class BufferedReaderDemo {
 
    // main driver method
    public static void main(String[] args) throws Exception
    {
 
        // File path is passed as parameter
        File file = new File("text.txt");
 
        // Creating an object of BufferedReader class
        BufferedReader br
            = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Consition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
    }
}
