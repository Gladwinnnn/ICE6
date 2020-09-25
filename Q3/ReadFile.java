import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Enter filename> ");
    String file = scanner1.nextLine();
    try {
        File file1 = new File(file);
        Scanner scanner = new Scanner(file1);
        int result = 0;
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] placeHolder = data.split(",");
            for (String s : placeHolder){ // looping through an ArrayList
                result += Integer.parseInt(s);
            }
            System.out.println(result);
            result = 0;
        }
        scanner1.close();
        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("" + file + " is invalid");
    }
  }
}