import java.math.BigDecimal;

public class BankAccount {


    public int calculateRateOfInterest (BigDecimal balance) {

        BigDecimal oneHundred = new BigDecimal("100"), oneThousand = new BigDecimal("1000");

        if ( (balance.compareTo(BigDecimal.ZERO) == 1) && (balance.compareTo(oneHundred) == -1)  ) {
            return 3;
        } else if ( (balance.compareTo(oneHundred) >= 0) && (balance.compareTo(oneThousand) == -1)  ) {
            return 5;
        } else if (balance.compareTo(oneThousand) >= 0) {
            return 7;
        } else {
            return 0; // in case if the balance is incorrect ( zero or negative values)
        }
    }
}
