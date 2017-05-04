import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/3/17.
 */


public class TestProduct {

    Product product;

    @Before
    public void setUp() {
        product = new Product("oranges", 2.59, 4);
    }

    // Test constructors for correct return of input one for each constructor
    @Test
    public void testProductId() {
        //: Given
        String expectedValue = "oranges";

        //: When
        String actualValue = product.getProductId();
        //: Then
        Assert.assertEquals("The expected result is oranges", expectedValue, actualValue);
    }


    @Test
    public void testGetProductPrice() {
        //: Given
        double expectedValue = 2.59;
        //: When
        double actualValue = product.getProductPrice();

        //: Then
        Assert.assertEquals("The expected result is 2.59", expectedValue, actualValue, 0);

    }

    @Test
    public void TestSetProductPrice() {
        //: Given
        double newprice = 2.59;
        double expectedNewPrice = 2.59;
        //: When
        double actualNewPrice = product.setProductPrice();
        //: Then
        Assert.assertEquals("The expected value of the new price is 2.59", expectedNewPrice, actualNewPrice, 0);
    }




    @Test
    public void testTotalProductValue() {
        //: Given
        double productValue = 10.36;
        double expectedProductValue = productValue;

        //: When
        double actualProductValue = product.totalProductValue();
        //: Then
        Assert.assertEquals("The expected product value is 10.36", expectedProductValue,actualProductValue,0);
    }

    // Test productQuantity Getter
    @Test
    public void testProductQuantity() {
        //: Given
        int prodQuantity = 3;
        int expectedValue = prodQuantity;
        //: When
        int actualValue = product.getProductQuantity();
        //: Then
        Assert.assertEquals("The expected return value is 3 ", expectedValue, actualValue, 0);
    }


}
