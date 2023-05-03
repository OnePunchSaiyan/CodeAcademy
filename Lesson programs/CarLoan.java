public class CarLoan {

    public static void main(String[] args) {
        // Step 1: Create a variable for car loan amount
        int carLoan = 10000;

        // Step 2: Create a variable for loan length (in years)
        int loanLength = 3;

        // Step 3: Create a variable for interest rate (as a percentage)
        int interestRate = 5;

        // Step 4: Create a variable for down payment
        int downPayment = 2000;

        // Step 5: Check if loan length or interest rate is invalid
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        }

        // Step 7: Check if down payment is greater than or equal to car loan
        else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        }

        // Step 9: Calculate monthly payment
        else {
            // Step 10: Calculate remaining balance after down payment
            int remainingBalance = carLoan - downPayment;

            // Step 11: Convert loan length to months
            int months = loanLength * 12;

            // Step 12: Calculate monthly balance before interest
            int monthlyBalance = remainingBalance / months;

            // Step 13: Calculate interest owed each month
            int interest = (monthlyBalance * interestRate) / 100;

            // Step 14: Calculate final monthly payment
            int monthlyPayment = monthlyBalance + interest;

            // Step 15: Print out the monthly payment
            System.out.println(monthlyPayment);
        }
    }
}
