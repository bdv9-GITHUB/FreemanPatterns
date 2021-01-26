package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.condiment.Mocha;
import decorator.condiment.Whip;

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
