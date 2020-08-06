package ictgradschool.industry.assignment02.farmmanager.animals;

/**
 * This class defines a Cow. A cow has an initial value of $1000, and a maximum value of $1500.
 * The cost to feed a cow is $50.
 * You may modify this class according to the assignment.
 *
 * @author write your name and UPI here.  Aaron Millar   amil721
 */
public class Cow extends Animal implements IProductionAnimal {
    private final int MAX_VALUE = 1500;

    public Cow() {
        value = 1000;
    }

    public void feed() {
        if (value < MAX_VALUE) {
            value += 100;
        }
    }

    public int costToFeed() {
        return 60;
    }

    public String getType() {
        return "Cow";
    }

    public String toString() {
        return getType() + " - $" + value;
    }

    public boolean harvestable() {
        return value == MAX_VALUE;
    }

    public int harvest() {
        if(!harvestable()){
            System.out.println("not harvestable");
            return 0;
        } else{
            return 20;
        }
    }
}
