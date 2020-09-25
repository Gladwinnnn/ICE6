import java.util.*;
import java.io.FileWriter;  
import java.io.File;

public class ProductTest {
  public static void main(String[] args){
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
  
    save(products,"data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName){
    //TODO: goes through products and saves each Product as a line in file
    //format: name,quantity,price
    try{    
      String placeHolder = "G:\\GitHub\\ICE6\\Q5\\" + pathAndFileName;
      File file = new File(placeHolder);
      file.createNewFile();
      FileWriter fw = new FileWriter(file);
      for (int i = 0; i < productList.size(); i++){
        fw.write("" + productList.get(i).getName() + "," + productList.get(i).getQuantity() + "," + productList.get(i).getPrice());
        fw.write("\r\n");
      } 
      fw.close();    
    } catch(Exception e){
      System.out.println(e);
    }    
    System.out.println("Success...");      
  }
}
