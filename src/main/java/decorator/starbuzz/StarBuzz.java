package decorator.starbuzz;

import decorator.starbuzz.beverage.Beverage;
import decorator.starbuzz.beverage.DarkRoast;
import decorator.starbuzz.beverage.Espresso;
import decorator.starbuzz.condiment.Mocha;
import decorator.starbuzz.condiment.Whip;

public class StarBuzz {
    public static void main(String[] args) {
        Beverage beverage;

        beverage = new Espresso();
        beverage.print();

        beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage.print();
    }
}
