package strategy.context;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.print(a + " - " + b + " = ");
        System.out.println(a - b);
        return a - b;
    }
}
