
/**
 * Creates the object of Money, that can be added, subtracted and even implement
 * taxes from Minnesota
 * 
 * @author mitzibustamante
 */
public class Money {
    // Constant - Can't change after it has been set
    /** Does not change Money Zero is amount of money 0 */
    public static final Money ZERO = new Money(0);
    /** Does not change Money onedollar is amount of money being $1 */
    public static final Money ONEDOLLAR = new Money(100);
    /** Does not change Money twodollars is amount of money being $2 */
    public static final Money TWODOLLAR = new Money(200);

    // Instance Variable
    /** Store the amount of money in cent */
    private int amountInCent;

    // Constructor
    /**
     * Creates the state of Money
     * 
     * @param numberOfCent : the cost of drink/mug in cents only
     */
    public Money(int numberOfCent) {
        this.amountInCent = numberOfCent;
    }

    // Method
    /**
     * Get the total of any drink/ mug with the minnesota tax included
     * 
     * @param subTotal : just the cost of everything
     * @return : the taxes of the drinks or mug including its price
     */
    public static Money computeMNSalddeTax(Money subTotal) {
        int cent = subTotal.amountInCent;
        double tax = 0.06875 * cent;
        int rest = (int) tax;
        int actualTax = rest;
        // around up to the nearest cent
        if (tax - rest > 0.50) {
            rest = rest + 1;
            return new Money(rest);
        }
        return new Money(actualTax);

    }

    /**
     * Its able to add money of two things.
     * 
     * @param other : a price of another thing coffee/tea/mug
     * @return : gives the total of both items
     */
    public Money add(Money other) {
        return new Money(this.amountInCent + other.amountInCent);
    }

    /**
     * Its able to subtract the price of two things
     * 
     * @param other : a price of another thing coffee/tea/mug
     * @return : give the subtracted amount of both item
     */
    public Money subtract(Money other) {
        return new Money(this.amountInCent - other.amountInCent);
    }

    /**
     * Give the amount of money in the format of $1.00 instead of 100
     * 
     * @return : the amount of money display in dollar sign
     */
    public String toString() {
        if (amountInCent > 100) {
            int amount = amountInCent / 100;
            int remanider = (amountInCent % 100);
            if (remanider < 10) {
                String re = "0" + remanider;
                return "$" + amount + "." + re;
            }
            return "$" + amount + "." + remanider;
        }
        if (amountInCent == 0) {
            return "$ 0.00";
        }
        return "" + amountInCent;
    }

}
