import java.util.ArrayList;

/**
 * Created by rahmirford on 5/3/17.
 */
public class Inventory {


    private int totalProductQuantity;
    private double totalInventoryValue;
    /*  We want the countInventory method to receive and add to the
        totalProductQuantity value.
     */

    private ArrayList<Product> inventory;

    public Inventory(){
        totalProductQuantity = 0;
        totalInventoryValue = 0;
        inventory = new ArrayList<Product>();
    }



    public void addProduct(Product p){
        inventory.add(p);
    }


    public double countInventory(){
        for(int i = 0; i < inventory.size(); i++){

        }
        return 0;
    }

    /* calculate the total value of each product based on the count and price
       then add

    */

    public double sumInventoryValue(){
        return 0;
    }


}
