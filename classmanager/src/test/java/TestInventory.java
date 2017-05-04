import org.junit.Assert;
import org.junit.Test;
import java.util.*;

/**
 * Created by rahmirford on 5/3/17.
 */
public class TestInventory {


    @Test
    public void TestTotalProductQuantity(){
        //: Given
        int x = 17;
        int expectedTotalProductQuantity = x;
        Inventory inventory = new Inventory();
        //: When
        int actualTotalProductQuantity = inventory.getTotalProductQuantity();
        //: Then
        Assert.assertEquals(getAssertionMessage("Total Product Quantity", 17), expectedTotalProductQuantity,actualTotalProductQuantity);
    }

    @Test
    public void TestTotalProductValue(){
        //: Given
        double x = 13.50;
        double expectedTotalProductValue = x;
        Inventory inventory = new Inventory();
        //: When
        double actualTotalProductValue = inventory.getTotalInventoryValue();
        //: Then
        Assert.assertEquals(getAssertionMessage("Total Product Value", 13.50), expectedTotalProductValue,actualTotalProductValue,0);
    }

    @Test
    public void TestAddProductQuantity(){
        //: Given
        int x = 75;
        int expectedProductQuantity= x;
        Inventory inventory = new Inventory();
        //: When
        int actualProductQuantity = inventory.addProductQuantity();
        //: Then
        Assert.assertEquals(getAssertionMessage("Quantity", 75.0), expectedProductQuantity,actualProductQuantity);
    }

    @Test
    public void TestAddProductValue(){
        //: Given
        double expectedProductValue = 39.84;
        Inventory inventory = new Inventory();
        ArrayList<Product> products = new ArrayList<Product>();
        Product broccoli = new Product("Broccoli", 2.49, 16);
        products.add(broccoli);
        //: When
        double actualProductValue = inventory.addProductValue(broccoli);
        //: Then
        Assert.assertEquals(expectedProductValue,actualProductValue,0);
    }

public String getAssertionMessage(String str, double value) {
        return "The expected return value for " + str + " is " + value;
}















//
//
//    @Test
//    public void testCountInventory(){
//        //: Given
//        int expectedCountInventory = 10;
//        Inventory inventory = new Inventory();
//        ArrayList<Product> listOfProducts = new ArrayList();
//        //listOfProducts.add("BROCCOLI",1, 3);
//
//        //: When
//        int actualCountInventory = inventory.countInventory(listOfProducts);
//        //: Then
//        Assert.assertEquals("The expected result", expectedCountInventory, actualCountInventory);
//    }
//
//    @Test
//    public void testSumInventory(){
//        //: Given
//        double x = 11.09;
//        double expectedSumInventory = 11.09;
//        Inventory inventory = new Inventory();
//        //: When
//        double actualSumInventory = inventory.sumInventoryValue();
//        //: Then
//        Assert.assertEquals("The expected inventory some",expectedSumInventory, actualSumInventory,0);
//    }

}
