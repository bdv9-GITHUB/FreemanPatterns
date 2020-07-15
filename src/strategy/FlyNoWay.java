package strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Not flying");
    }
}
