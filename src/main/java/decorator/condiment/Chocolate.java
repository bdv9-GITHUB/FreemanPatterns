package decorator.condiment;

import decorator.beverage.Beverage;

public class Chocolate extends CondimentDecorator {
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
