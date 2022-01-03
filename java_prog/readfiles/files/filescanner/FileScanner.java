import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileScanner {
  public static void main(String[] args) {
    try {
      File myObj = new File("text.txt");
      Scanner sc = new Scanner(myObj);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        System.out.println(data);
      }
      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

