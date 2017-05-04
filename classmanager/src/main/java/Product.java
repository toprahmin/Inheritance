import java.util.*;

/**
 * Created by rahmir ford on 5/3/17.
 */
public class Product{

    Scanner in = new Scanner(System.in);
    private double productValue;
    private double productPrice;
    private String productId;
    private int productQuantity;

    public Product(){}
    public Product(String productId) {
        this.productId = productId;
    }

    public Product(String productId, double productPrice){
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public Product(String productId, double productPrice, int productQuantity){
        this.productId = productId;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String setProductId(){
        productId = in.nextLine();
        return productId;
    }

    public String getProductId(){
        return productId;
    }

    public double setProductPrice(){
        productPrice = in.nextDouble();
        return productPrice;
    }

    public double getProductPrice(){
        return productPrice;
    }

    public int setProductQuantity(){
        productQuantity = in.nextInt();
        return productQuantity;
    }

    public int getProductQuantity(){
        return productQuantity;
    }

    public double totalProductValue(){
        productValue = productPrice * productQuantity;
        return productValue;
    }
}
