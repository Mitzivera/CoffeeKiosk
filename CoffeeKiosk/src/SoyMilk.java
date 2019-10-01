/**
 * The class of SoyMilk, with cost and calories
 * 
 * @author mitzibustamante
 */
public class SoyMilk extends Additions {

    // Constructor
    /** Creates the state for the SoyMilk */
    public SoyMilk() {
        // call from the inherited class Additions
        super();
    }

    // Methods
    /**
     * Gets the cost for the SoyMilk overriding it from abstract addition
     * 
     * @return : return the amount of cost in Money
     */
    @Override
    public Money getCost() {
        return Money.ONEDOLLAR;
    }

    /**
     * Gets the calories for SoyMilk
     * 
     * @return : return the calories amount in integer
     */
    @Override
    public int getCalories() {
        return 80;
    }

    /**
     * The name of the addOn-Soy Milk
     * 
     * @return : the name of the addOn.
     */
    public String toString() {
        return "Soy";
    }

}
