import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
      boolean status = true;
      while(status){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter filename> ");
        String file = scanner1.nextLine();
        try {
            int result = 0;
            File file1 = new File(file);
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                result += Integer.parseInt(data);
            }
            System.out.print("The sum is " + result);
            scanner1.close();
            scanner.close();
            status = false;
        } catch (FileNotFoundException e) {
            System.out.println("" + file + " is invalid");
        }
      }
  }
}