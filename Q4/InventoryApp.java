import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InventoryApp{
    public static void main(String[] args){
        stockTaking("product.csv");
    }

    public static void stockTaking(String fileNameAndPath){
        try{
            File file = new File(fileNameAndPath);
            Scanner scanner = new Scanner(file);
            int count = 0;
            double amount = 0;

            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] placeHolder = data.split(",");
                for (int i = 0; i < placeHolder.length; i+= 3){
                    System.out.println("There are " + placeHolder[i] + " " + placeHolder[i+1] + ", each cost $" + placeHolder[i+2]);
                    count += Double.parseDouble(placeHolder[i]);
                    amount +=  (Double.parseDouble(placeHolder[i+2]) * Double.parseDouble(placeHolder[i]));
                }
            }
            System.out.print("There are " + count + " products with a total value of $" + amount + " to be sold.");
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
    }
}