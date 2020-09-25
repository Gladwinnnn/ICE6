import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;

public class ReadFile {
  public static void main(String[] args) {
    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Enter filename> ");
    String file = scanner1.nextLine();
    try {
        File file1 = new File(file);
        Scanner scanner = new Scanner(file1);
        while (scanner.hasNextLine()) {
            ArrayList<String> strList = new ArrayList<>();
            String data = scanner.nextLine();
            String[] placeHolder = data.split(",");
            String result = "";

            for (String s : placeHolder){ // looping through an ArrayList
                strList.add(s);
            }
            Collections.reverse(strList);
            for (String s : strList){ // looping through an ArrayList
                result += s + ",";
            }
            System.out.println(result.substring(0,result.length()-1));
        }
        scanner1.close();
        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("" + file + " is invalid");
    }
  }
}