package strategy.context;

public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context();

        // Выбор стратегии сложения
        context.setStrategy(new ConcreteStrategyAdd());
        System.out.println(context.executeStrategy(1, 2));

        // Выбор стратегии вычитания
        context.setStrategy(new ConcreteStrategySubtract());
        System.out.println(context.executeStrategy(4, 3));

        // Выбор стратегии умножения
        context.setStrategy(new ConcreteStrategyMultiply());
        System.out.println(context.executeStrategy(5, 6));
    }
}
