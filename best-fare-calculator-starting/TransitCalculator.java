public class TransitCalculator {

                int days;
                int rides;

    public TransitCalculator(int days, int rides) {
        this.days = days;
        this.rides = rides;

    }
    public double[] getTransitOptions() {
        double[] transitOptions = new double[3];
        double singleride = 2.75;
        double sevenday = 33.00;
        double thirtyday = 127.00;
        return transitOptions;
    }


        public double unlimited7Price( double numDays, double numRides) {
            double numPasses = Math.ceil(numDays / 7); // round up to the nearest 7-day period
            double totalCost = numPasses * 33.0;
            double costPerRide = totalCost / numRides;
            return costPerRide;
        }

        public double[] getRidePrices() {
            double[] ridePrices = new double[3];
            double cost1 = unlimited7Price(19, 20); // returns 4.95
            double cost2 = unlimited7Price(22, 50); // returns 2.64
            double cost3 = unlimited7Price(6, 14); // returns 2.36

        return ridePrices;
    }
    public String[] getBestFare() {
        String[] bestFare = new String[3];
        double[] ridePrices = getRidePrices();
        double minPrice = ridePrices[0];
        int minIndex = 0;
        for (int i = 1; i < ridePrices.length; i++) {
            if (ridePrices[i] < minPrice) {
                minPrice = ridePrices[i];
                minIndex = i;
            }
        }
        if (minIndex == 0) {
            bestFare[0] = "Pay-per-ride is the best option for you.";
            bestFare[1] = "You should buy at least " + Math.ceil(days / 7.0) + " 7-day passes.";
            bestFare[2] = "You should buy the 30-day Unlimited pass.";
        } else if (minIndex == 1) {
            bestFare[0] = "You should buy " + Math.ceil(rides / 50.0) + " 50-ride";
            bestFare[1] = "You should buy at least " + Math.ceil(days / 7.0) + " 7-day passes.";
            bestFare[2] = "You should buy the 30-day Unlimited pass.";
        } else {
            bestFare[0] = "You should buy the 7-day Unlimited pass.";
            bestFare[1] = "You should buy at least " + Math.ceil(rides / 14.0) + " Pay-per-ride";
            bestFare[2] = "You should buy the 30-day Unlimited pass.";
        }

        return bestFare;
    }


    public static void main(String[] args) {


    }

}
