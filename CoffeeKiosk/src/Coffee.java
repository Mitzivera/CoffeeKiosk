
/**
 * Its the drink Coffee( decaf or not) getting the cost and the calories
 * 
 * @author mitzibustamante
 */
public class Coffee extends Beverage {
    // Instance Variable
    /** Set the states of isDecaf; true if its decaf and false if its not */
    private boolean isDecaf;

    // Constructor
    /**
     * Creates the object for Coffee
     * 
     * @param decaf : True if decaf or false when its not
     */
    public Coffee(boolean decaf) {
        super();
        this.isDecaf = decaf;
    }

    // Methods
    /**
     * Gets the price of just the coffee, and if there is any addOns also includes
     * the price of that
     * 
     * @return : the price for coffee with and without addons
     */
    @Override
    public Money getCost() {
        // check the size before adding the cost of the add to its size price
        Money getCost = Money.ZERO;
        Money totalCost = Money.ZERO;
        if (size == Beverage.SMALL) {
            for (int i = 0; i < addOns.size();) {
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
        } else if (size == Beverage.MEDIUM) {
            for (int i = 0; i < addOns.size();) {
                if (addOns.size() == 2) {
                    getCost = addOns.get(0).getCost().add(addOns.get(1).getCost());
                    totalCost = getCost.add(Money.TWODOLLAR);
                    return totalCost;
                } else if (addOns.size() == 1) {
                    getCost = addOns.get(i).getCost();
                    totalCost = getCost.add(Money.TWODOLLAR);
                    return totalCost;
                }
            }
        } else if (size == Beverage.LARGE) {
            for (int i = 0; i < addOns.size(); i++) {
                if (addOns.size() == 2) {
                    getCost = addOns.get(0).getCost().add(addOns.get(1).getCost());
                    totalCost = getCost.add(new Money(250));
                    return totalCost;
                } else if (addOns.size() == 1) {
                    getCost = addOns.get(i).getCost();
                    totalCost = getCost.add(new Money(250));
                    return totalCost;
                } else if (addOns.size() == 0) {
                    totalCost = getCost.add(new Money(250));
                }
            }
            totalCost = getCost.add(new Money(250));
        }
        if (addOns.size() == 0) {
            if (size == Beverage.SMALL) {
                totalCost = new Money(150);
            } else if (size == Beverage.MEDIUM) {
                totalCost = Money.TWODOLLAR;
            } else {
                totalCost = new Money(250);
            }
        }
        return totalCost;
    }

    /**
     * Gets the calories of the coffee with or/and without the addons calories
     * included
     * 
     * @return : the calories from the coffee, if there are addon it includes it
     */
    @Override
    public int getCalories() {
        if (size == Beverage.SMALL) {
            int getCalorie = 0;
            int totalCalories = 0;
            for (int i = 0; i < addOns.size(); i++) {
                if (addOns.size() == 1) {
                    // check if there is one add on (either soymilk or sugarsyrup)
                    getCalorie = addOns.get(0).getCalories();
                    totalCalories = getCalorie + 5;
                    return totalCalories;
                } else if (addOns.size() == 2) {
                    // check if there is two thing to add on to the coffee
                    getCalorie = addOns.get(0).getCalories();
                    totalCalories = getCalorie + addOns.get(1).getCalories() + 5;
                    return totalCalories;
                }
            }
            return 5;
        } else if (size == Beverage.MEDIUM) {
            int getCalorie = 0;
            int totalCalories = 0;
            for (int i = 0; i < addOns.size(); i++) {
                if (addOns.size() == 1) {
                    // check if there is one add on (either soymilk or sugarsyrup)
                    getCalorie = addOns.get(0).getCalories();
                    totalCalories = getCalorie + 10;
                    return totalCalories;
                } else if (addOns.size() == 2) {
                    // check if there is two thing to add on to the coffee
                    getCalorie = addOns.get(0).getCalories();
                    totalCalories = getCalorie + addOns.get(1).getCalories() + 10;
                    return totalCalories;
                }
            }
            return 10;
        } else if (size == Beverage.LARGE) {
            int getCalorie = 0;
            int totalCalories = 0;
            for (int i = 0; i < addOns.size(); i++) {
                if (addOns.size() == 1) {
                    // check if there is one add on (either soymilk or sugarsyrup)
                    getCalorie = addOns.get(0).getCalories();
                    totalCalories = getCalorie + 15;
                    return totalCalories;
                } else if (addOns.size() == 2) {
                    // check if there is two thing to add on to the coffee
                    getCalorie = addOns.get(0).getCalories();
                    totalCalories = getCalorie + addOns.get(1).getCalories() + 15;
                    return totalCalories;
                }
            }
            return 15;
        } else
            return 0;
    }

    /**
     * The name, calories and price of the things that the user is going to buy
     * 
     * @return : the name of the things the use has bought
     */
    public String toString() {
        String wholeOrder = "";
        String decaf = "";
        if (this.isDecaf == true) {
            decaf = "Decaf";
        } else {
            decaf = "";
        }
        if (size == Beverage.SMALL) {
            if (addOns.size() == 0) {
                wholeOrder = "Small " + decaf + " Coffee " + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 1) {
                wholeOrder = "Small " + decaf + " Coffee + " + addOns.get(0).toString() + "(" + getCalories()
                        + " calories) ";
            } else if (addOns.size() == 2) {
                wholeOrder = "Small " + decaf + " Coffee + Soy + Sugar " + "(" + getCalories() + " calories) ";
            }
        }
        // Check the size and then check if there is any add on, depending on addon it
        // prints the addOns name
        if (size == Beverage.MEDIUM) {
            if (addOns.size() == 0) {
                wholeOrder = "Medium " + decaf + " Coffee " + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 1) {
                wholeOrder = "Medium " + decaf + " Coffee + " + addOns.get(0).toString() + "(" + getCalories()
                        + " calories) ";
            } else if (addOns.size() == 2) {
                wholeOrder = "Medium " + decaf + " Coffee + Soy + Sugar " + "(" + getCalories() + " calories) ";
            }
        }
        // Check the size and then check if there is any add on, depending on addon it
        // prints the addOns name
        if (size == Beverage.LARGE) {
            if (addOns.size() == 0) {
                wholeOrder = "Large " + decaf + " Coffee " + "(" + getCalories() + " calories) ";
            } else if (addOns.size() == 1) {
                wholeOrder = "Large " + decaf + " Coffee + " + addOns.get(0).toString() + "(" + getCalories()
                        + " calories) ";
            } else if (addOns.size() == 2) {
                wholeOrder = "Large " + decaf + " Coffee + Soy + Sugar " + "(" + getCalories() + " calories) ";
            }
        }
        return wholeOrder;
    }

}
