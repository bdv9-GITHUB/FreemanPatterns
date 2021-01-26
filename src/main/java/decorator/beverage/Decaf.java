package decorator.beverage;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decafe");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
