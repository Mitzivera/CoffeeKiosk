
/**
 * The class for Mug with the cost
 * 
 * @author mitzibustamante
 */
public class Mug implements Buyable {
    // Constructor
    /** Creates the class of the Mug */
    public Mug() {

    }

    // Method
    /**
     * Gets the cost of the Mug
     * 
     * @return : the cost of the Mug in Money
     */
    @Override
    public Money getCost() {
        return new Money(500);
    }

    /**
     * A string of the name of the mug with its price
     * 
     * @return : the name of the mug with the price
     */
    public String toString() {
        return "Classy Mug: ";
    }
}
