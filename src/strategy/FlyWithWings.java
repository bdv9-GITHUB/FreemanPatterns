package strategy;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with wings");
    }

    public static class FlyRocketPowered implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("Flying with rocket");
        }
    }
}
