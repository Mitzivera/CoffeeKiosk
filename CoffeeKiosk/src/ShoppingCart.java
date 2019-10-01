import java.util.ArrayList;

/**
 * Add all the things that are buyable to the cart including the coffee/tea
 * (with or without) addOns and the mug. It computes the whole sale tax of
 * Minnesota and puts them in order from the first thing added to the cart to
 * the last item added to the cart
 * 
 * @author mitzibustamante
 *
 */
public class ShoppingCart {
    // Instance Variable
    /** Set the state for items that have buyable to be added to an array list */
    private ArrayList<Buyable> items;

    // Constructor
    /** Create the object of ShoppingCart */
    public ShoppingCart() {
        items = new ArrayList<Buyable>();
    }

    // Method
    /**
     * It adds items to the shopping chart that can only be buyable
     * 
     * @param item : only item that are buyable (that have getcost)
     */
    public void addItem(Buyable item) {
        this.items.add(item);
    }

    /**
     * Goes through the list and get the price of every item that's in that cart and
     * then adds them all up and compute the sale tax and give the final price that
     * includes the all price with sale tax of MN
     * 
     * @return : get the total cost of the shopping cart including the sale tax of
     *         MN
     */
    public Money getTotal() {
        Money getCost = Money.ZERO;
        // gets cost from all the items
        for (int i = 0; i < items.size(); i++) {
            getCost = items.get(i).getCost().add(getCost);
        }
        // gets taxes from the item and then add the item amount back
        return Money.computeMNSalddeTax(getCost).add(getCost);
    }

    /**
     * It give a list of the item being bought with it price and the total price
     * 
     * @return : A list of all the things being added to the list with it's price
     *         and the total price
     */
    public String toString() {
        String theOrder = "";
        int i = 0;
        // loops through the size of the list
        while (i < items.size()) {
            // the 1 is being added to i so that it can start with 1 instead of 0
            theOrder = theOrder + "\n" + (i + 1) + ".) " + items.get(i) + items.get(i).getCost();
            i = i + 1;
        }
        // When there is nothing on the shopping cart
        if (items.size() == 0) {
            theOrder = "There are no item, please buy something! :)";
        }
        return theOrder + "\n" + "Total: " + getTotal();
    }
}
