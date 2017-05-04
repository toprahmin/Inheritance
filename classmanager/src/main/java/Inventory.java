import java.util.ArrayList;

/**
 * Created by rahmirford on 5/3/17.
 */
public class Inventory {


    private int totalProductQuantity;
    private double totalInventoryValue;
    private ArrayList<Product> products = new ArrayList<Product>();

    // Create getter for arraylist
    public int getTotalProductQuantity(){
        return totalProductQuantity;
    }

    public double getTotalInventoryValue(){
        return totalInventoryValue;
    }

    // add product quantity to totalProductQuantity
    public int addProductQuantity(){
        return 0;
    }

    public int addProductQuantity(Product j){
        return totalProductQuantity += j.getProductQuantity();
    }

    public double addProductValue(Product j){
        return totalInventoryValue += j.totalProductValue();
    }


    // Add instances of product to the Inventory ArrayList
    public void addToInventory(Product j){
        products.add(j);
    }

    public int countInventory(){
            return products.size();
    }
    public void showInventory(){
        System.out.println(products);
    }


    public double sumInventoryValue(){
        return 0;
    }


}
