package strategy.context;

// Реализуем алгоритм с использованием интерфейса стратегии
public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.print(a + " + " + b + " = ");
        return a + b;
    }
}
