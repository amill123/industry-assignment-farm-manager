package ictgradschool.industry.assignment02.farmmanager.animals;

public class Pig extends Animal{
    private final int MAX_VALUE = 900;

    public Pig() {
        value = 500;
    }

    public void feed(){
        if (value < MAX_VALUE) {
            value = value + 75;
            if(value > MAX_VALUE) {
                value = MAX_VALUE;
            }
        }
    }

    public int costToFeed() {
        return 30;
    }

    public String getType() {
        return "Pig";
    }

    public String toString() {
        return getType() + " - $" + value;
    }

}
