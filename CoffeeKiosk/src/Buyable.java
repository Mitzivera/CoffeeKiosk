
/**
 * Makes it able to get the cost of the different item even though they have
 * nothing in common except just getCost()
 * 
 * @author mitzibustamante
 */
public interface Buyable {
    // Java Interface : group together unrelated method just by the public type
    Money getCost();
}
