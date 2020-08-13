package strategy.context;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.print(a + " * " + b + " = ");
        return a * b;
    }
}
