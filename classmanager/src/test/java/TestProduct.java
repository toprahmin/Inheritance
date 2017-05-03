import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/3/17.
 */
public class TestProduct {
    Product product;

    @Before
    public void setUp() {product = new Product(); }

    // Test constructors for correct return of input one for each constructor
    @Test
    public void testProductIdConstructor(){
        //: Given
        String prodId = "Bananas";
        String expectedValue = prodId;
        //: When
        String actualValue = product.getProductId();
        //: Then
        Assert.assertEquals("The expected result is Bananas", expectedValue,actualValue);
    }

    @Test
    public void testProductPriceConstructor(){
        //: Given
        double prodPrice = 2.99;
        double expectedValue = prodPrice;
        //: When
        double actualValue = product.getProductPrice();

        //: Then
        Assert.assertEquals("The expected result is 2.99", expectedValue,actualValue, 0);

    }

    @Test
    public void testProductIdProductQuantityConstructor(){
        //: Given
        int prodQuantity = 5;
        int expectedValue = prodQuantity;
        //: When
        int actualValue = product.getProductQuantity();
        //: Then
        Assert.assertEquals("The expected result is 5", expectedValue,actualValue);
    }

    // Test productId getter
    @Test
    public void testGetProductId(){
        //: Given
        String prodId = "Bananas";
        String expectedValue = "Bananas";
        //: When
        String actualValue = product.getProductId();
        //: Then
        Assert.assertEquals("The expected return value is 'Bananas", expectedValue, actualValue);
    }
    // Test ProductPrice Getter
        @Test
        public void testProductPrice(){
        //: Given
        double prodPrice = 2.49;
        double expectedValue = prodPrice;
        //: When
        double actualValue = product.getProductPrice();
        //: Then
        Assert.assertEquals("The expected return value is 2.49 ", expectedValue, actualValue, 0);
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
        Assert.assertEquals("The expected return value is 2.49 ", expectedValue, actualValue, 0);

    }
}
