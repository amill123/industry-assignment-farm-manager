package ictgradschool.industry.assignment02.farmmanager.animals;

public class Chicken extends Animal implements IProductionAnimal {
    private final int MAX_VALUE = 300;

    public Chicken() {
        value = 200;
    }

    public void feed(){
        if (value < MAX_VALUE) {
            value = value + (MAX_VALUE - value) / 2;
            if(value > MAX_VALUE) {
                value = MAX_VALUE;
            }
        }
    }

    public int costToFeed() {
        return 3;
    }

    public String getType() {
        return "Chicken";
    }

    public String toString() {
        return getType() + " - $" + value;
    }

    public boolean harvestable(){
        return true;
    }

    public int harvest() {
        return 5;
    }
}
