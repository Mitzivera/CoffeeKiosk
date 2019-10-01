
/**
 * Its the drink -tea: If it has add ons then it add them to the cost and the
 * calories. If not then it just count the price and calories of the tea.
 * 
 * @author mitzibustamante
 */
public class Tea extends Beverage {

    // Constructor
    /** Creates the states of the Tea */
    public Tea() {
        super();
    }

    // Methods
    /**
     * Get the cost of just Tea, and also with the add ons with one or the other, or
     * both.
     * 
     * @return: the cost tea including the addOns.
     */

    @Override
    public Money getCost() {
        Money getCost = Money.ZERO;
        Money totalCost = Money.ZERO;
        for (int i = 0; i < addOns.size();) {
            // check if there is one add on (either soymilk or sugarsyrup)
            if (addOns.size() == 2) {
                getCost = addOns.get(0).getCost().add(addOns.get(1).getCost());
                totalCost = getCost.add(new Money(150));
                return totalCost;
            } else {
                getCost = addOns.get(i).getCost();
                totalCost = getCost.add(new Money(150));
                return totalCost;
            }

        }
        if (addOns.size() == 0) {
            // if there is no add on then its just the tea price
            totalCost = new Money(150);
        }
        return totalCost;
    }

    /**
     * Get the calories of the Tea with and without add ons
     * 
     * @return : the calories of just the tea, and also including the add ons
     */
    @Override
    public int getCalories() {
        int getCalorie = 0;
        int totalCalories = 0;
        for (int i = 0; i < addOns.size(); i++) {
            if (addOns.size() == 1) {
                // check if there is one add on (either soymilk or sugarsyrup)
                getCalorie = addOns.get(0).getCalories();
                totalCalories = getCalorie + 5;
            } else if (addOns.size() == 2) {
                // check if there is two thing to add on to the tea
                getCalorie = addOns.get(0).getCalories();
                totalCalories = getCalorie + addOns.get(1).getCalories() + 5;
            }
        }
        if (addOns.size() == 0) {
            // if there is no add on then its just the tea calories
            totalCalories = 5;
        }
        return totalCalories;

    }

    public String toString() {
        String wholeOrder = "";
        // Check the size and then check if there is any add on, depending on addon it
        // prints the addOns name
        if (size == 0) {
            if (addOns.size() == Beverage.SMALL) {
                wholeOrder = "Small Tea " + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 1) {
                wholeOrder = "Small Tea + " + addOns.get(0).toString() + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 2) {
                wholeOrder = "Small Tea + Sugar + Soy " + "(" + getCalories() + " calories) ";
            }
        }
        // Check the size and then check if there is any add on, depending on addon it
        // prints the addOns name
        if (size == Beverage.MEDIUM) {
            if (addOns.size() == 0) {
                wholeOrder = "Medium Tea " + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 1) {
                wholeOrder = "Medium Tea + " + addOns.get(0).toString() + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 2) {
                wholeOrder = "Medium Tea + Soy + Sugar " + "(" + getCalories() + " calories) ";
            }
        }
        // Check the size and then check if there is any add on, depending on addon it
        // prints the addOns name
        if (size == Beverage.LARGE) {
            if (addOns.size() == 0) {
                wholeOrder = "Large Tea " + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 1) {
                wholeOrder = "Large Tea + " + addOns.get(0).toString() + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 2) {
                wholeOrder = "Large Tea + Soy + Sugar " + "(" + getCalories() + " calories) ";
            }
        }
        return wholeOrder;
    }
}
