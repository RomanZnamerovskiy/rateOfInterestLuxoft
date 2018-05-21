import org.junit.*;
import static junit.framework.TestCase.assertEquals;

/* For manual and automation testing I will use the boundary values
I will put next values for testing: 0.01, 99.99, 100, 999.99, 1000, 20000
and the values for negative testing: -1, 0
 */
public class TestCalculateRateOfInterest {

    RateOfInterest rate = new RateOfInterest();

    @Test
    public void testFirstRange_minValue() {
        assertEquals("The rate of interest should be 3%",3, rate.calculateRateOfInterest(0.01));
    }

    @Test
    public void testFirstRange_maxValue() {
        assertEquals("The rate of interest should be 3%",3, rate.calculateRateOfInterest(99.99));
    }

    @Test
    public void testSecondRange_minValue() {
        assertEquals("The rate of interest should be 5%",5, rate.calculateRateOfInterest(100));
    }

    @Test
    public void testSecondRange_maxValue() {
        assertEquals("The rate of interest should be 5%",5, rate.calculateRateOfInterest(999.99));
    }

    @Test
    public void testThirdRange_minValue() {
        assertEquals("The rate of interest should be 7%",7, rate.calculateRateOfInterest(1000));
    }

    @Test
    public void testThirdRange_anyBigValue() {
        assertEquals("The rate of interest should be 7%",7, rate.calculateRateOfInterest(20000));
    }

    @Test
    public void testThirdRange_zeroValue() {
        assertEquals("The rate of interest should be 0",0, rate.calculateRateOfInterest(0));
    }

    @Test
    public void testThirdRange_negativeValue() {
        assertEquals("The rate of interest should be 0",0, rate.calculateRateOfInterest(-1));
    }

}
