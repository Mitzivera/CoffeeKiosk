/**
 * The class of Sugar Syrup with cost and calories
 * 
 * @author mitzibustamante
 */
public class SugarSyrup extends Additions {

    // Constructor
    /** Creates the states for SugarSyrup */
    public SugarSyrup() {
        super();
    }

    // Methods
    /**
     * Gets the amount/cost of the SugarSyrup
     * 
     * @return : the cost of it in the money object
     */
    @Override
    public Money getCost() {
        return new Money(50);
    }

    /**
     * Gets the calories of Sugar Syrup
     * 
     * @return : the calories in integers
     */
    @Override
    public int getCalories() {
        return 60;
    }

    /**
     * The name of the addOn-Sugar Syrup
     * 
     * @return : the name of the addOn.
     */
    public String toString() {
        return "Sugar";
    }
}
