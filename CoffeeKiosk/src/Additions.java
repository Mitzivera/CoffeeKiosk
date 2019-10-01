
/**
 * This class will add the soymilk or sugarsyrup to the tea or coffee. Also
 * adding the cost and the calories
 * 
 * @author mitzibustamante
 */
public abstract class Additions {
    // Constructor
    /** Creates the state of Additions, which add stuff to the drink */
    public Additions() {

    }

    // Methods
    /**
     * Only knows it get the cost, does not know from what yet
     * 
     * @return : the cost of the additions
     */
    public abstract Money getCost();

    /**
     * Only knows it get the calories, does not know from what yet.
     * 
     * @return : the amount of calories that is being added to the drinks
     */
    public abstract int getCalories();

}
