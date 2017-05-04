import java.util.ArrayList;

/**
 * Created by rahmirford on 5/3/17.
 */
public class Inventory {


    private int totalProductQuantity;
    private double totalInventoryValue;
    ArrayList<Product> listOfProducts = new ArrayList<Product>();

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
    public void addToInventory(Product product){
        listOfProducts.add(product);
    }

    public int countInventory(){
            return listOfProducts.size();
    }
    public ArrayList showInventory(){
        System.out.println(listOfProducts);
        return listOfProducts;
    }
//    public double getInventoryValue(ArrayList<Product> listOfProducts) {
//        double total = 0;
//        for( int i = 0; i < listOfProducts.size(); i++){
//            total += listOfProducts.get(i).getProductPrice() * listOfProducts.get(i).getProductQuantity();
//        }
//        return total;
//    }

    public double getInventoryValue(ArrayList<Product> listOfProducts) {
        double total = 0;
        for(Product product: listOfProducts){
            total += product.getProductPrice() * product.getProductQuantity();
        }
        return total;
    }




    public double sumInventoryValue(){
        return 0;
    }


}
