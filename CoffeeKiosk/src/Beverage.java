import java.util.ArrayList;

/**
 * Where beverage can be coffee or tea with two addOn if the costumer chooses to
 * add it. Determines the cost depending on the size that the user chooses
 * 
 * @author mitzibustamante
 *
 */
public abstract class Beverage implements Buyable {
    // Constant - set and final it cannot be changed
    /** Set the size of the cup determined by the integer */
    public static final int LARGE = 2;
    /** Set the size of the cup determined by the integer */
    public static final int MEDIUM = 1;
    /** Set the size of the cup determined by the integer */
    public static final int SMALL = 0;

    // Instance Variable
    /** Set the state of addOns, the addOn are going to be added to this list */
    protected ArrayList<Additions> addOns;
    /** Set the state of the size (small,medium,large) */
    protected int size;

    // Constructor
    /**
     * Creates the object of Beverage, with the size set to zero that can be
     * changed, and creating a new arraylist.
     */
    public Beverage() {
        this.size = 0;
        addOns = new ArrayList<Additions>();

    }

    // Methods
    // TBD We know we want it and later we will fill in the detail in each different
    // class
    /** Does not know what get cost is yet, but it can later be determined */
    public abstract Money getCost();

    /** Does not know what get calories is yet, but it can later be determined */
    public abstract int getCalories();

    /**
     * The user get to chose the size cup they want
     * 
     * @param size : the user desired size of the cup
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * If user want it can add stuff to its coffee and/or tea
     * 
     * @param other : add the add on that can be added to coffee or tea
     */
    public void addToDrink(Additions other) {
        addOns.add(other);
    }
}
