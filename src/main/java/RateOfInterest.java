import java.math.BigDecimal;

public class RateOfInterest {

    int calculateRateOfInterest (BigDecimal balance) {
        if ( (balance.compareTo(new BigDecimal("0")) == 1) && (balance.compareTo(new BigDecimal("100")) == -1)  ) {
            return 3;
        } else if ( (balance.compareTo(new BigDecimal("100")) >= 0) && (balance.compareTo(new BigDecimal("1000")) == -1)  ) {
            return 5;
        } else if (balance.compareTo(new BigDecimal("1000")) >= 0) {
            return 7;
        } else {
            return 0; // in case if the balance is incorrect ( zero or negative values)
        }
    }
}
