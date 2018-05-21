public class RateOfInterest {

    int calculateRateOfInterest (double balance) {
        if (balance > 0 && balance < 100) {
            return 3;
        } else if (balance >= 100 && balance < 1000) {
            return 5;
        } else if (balance >= 1000) {
            return 7;
        } else {
            return 0; // in case if the balance is incorrect ( zero or negative values)
        }
    }
}
