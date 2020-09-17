package strategy.context;

// Класс контекста использующий интерфейс стратегии
public class Context {
    private Strategy strategy;

    public Context() {
    }

    // Выбор стратегии
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Выполнение стратегии
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
