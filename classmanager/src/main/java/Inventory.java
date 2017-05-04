import java.util.ArrayList;

/**
 * Created by rahmirford on 5/3/17.
 */
public class Inventory {

    private double totalProductValue;
    private int totalProductQuantity;

    /*  We want the countInventory method to receive and add to the
        totalProductQuantity value.
     */

    private ArrayList<Product> inventory;

    public Inventory(){
        totalProductQuantity = 0;
        totalProductValue = 0;
        inventory = new ArrayList<Product>();
    }



    public void addProduct(Product p){
        inventory.add(p);
    }


//    public int countInventory(){
//        totalProductQuantity += Product.getProductQuantity();
//        return totalProductQuantity;
//    }

    /* calculate the total value of each product based on the count and price
       then add

    */

    public double sumInventoryValue(){
        return 0;
    }


}
