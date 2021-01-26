package decorator.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("DarkRoast");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
