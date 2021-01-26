package decorator.starbuzz.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
