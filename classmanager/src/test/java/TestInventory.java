import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/3/17.
 */
public class TestInventory {

    Inventory inv;
    @Before
    public void setUp() {inv = new Inventory();}

//  ******* uncomment this when we work on the countInventory method ********
    @Test
    public void testCountInventory(){
        //: Given
        int x = 10;
        int expectedCountInventory = 10;
        //: When
        double actualCountInventory = inv.countInventory();
        //: Then
        Assert.assertEquals("The expected result", expectedCountInventory, actualCountInventory);
    }

    @Test
    public void testSumInventory(){
        //: Given
        double x = 11.09;
        double expectedSumInventory = 11.09;
        //: When
        double actualSumInventory = inv.sumInventoryValue();
        //: Then
        Assert.assertEquals("The expected inventory some",expectedSumInventory, actualSumInventory,0);
    }

}
