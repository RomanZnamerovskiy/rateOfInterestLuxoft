import org.junit.*;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

/* For manual and automation testing I will use the boundary values
I will put next values for testing: 0.00001, 99.99999, 100, 999.99999, 1000, Double.Max_Value
and the values for negative testing: 0, -0.00001, -Double.MAX_VALUE, "aa"

During manual testing instead of Double.Max_Value I will put and verify big double value.

 */
public class TestCalculateRateOfInterest {

    BankAccount rate = new BankAccount();

    @Test
    public void testFirstRange_MinValue() {
        assertEquals("The rate of interest should be 3%",3, rate.calculateRateOfInterest(new BigDecimal("0.00001")));
    }

    @Test
    public void testFirstRange_MaxValue() {
        assertEquals("The rate of interest should be 3%",3, rate.calculateRateOfInterest(new BigDecimal("99.99999")));
    }

    @Test
    public void testSecondRange_MinValue() {
        assertEquals("The rate of interest should be 5%",5, rate.calculateRateOfInterest(new BigDecimal("100")));
    }

    @Test
    public void testSecondRange_MaxValue() {
        assertEquals("The rate of interest should be 5%",5, rate.calculateRateOfInterest(new BigDecimal("999.99999")));
    }

    @Test
    public void testThirdRange_MinValue() {
        assertEquals("The rate of interest should be 7%",7, rate.calculateRateOfInterest(new BigDecimal("1000")));
    }

    @Test
    public void testThirdRange_DoubleMaxValue() {
        assertEquals("The rate of interest should be 7%",7, rate.calculateRateOfInterest(new BigDecimal(Double.MAX_VALUE)));
    }

    @Test
    public void testNegativeValue_ZeroValue() {
        assertEquals("The rate of interest should be 0",0, rate.calculateRateOfInterest(new BigDecimal("0")));
    }

    @Test
    public void testNegativeValue_NegativeValue() {
        assertEquals("The rate of interest should be 0",0, rate.calculateRateOfInterest(new BigDecimal("-0.00001")));
    }

    @Test
    public void testNegativeValue_DoubleMinVAlue() {
        assertEquals("The rate of interest should be 0",0, rate.calculateRateOfInterest(new BigDecimal(-Double.MAX_VALUE)));
    }

    @Test(expected = NumberFormatException.class)
    public void testNegative_StringValue() {
        rate.calculateRateOfInterest(new BigDecimal("aa"));
    }

}
