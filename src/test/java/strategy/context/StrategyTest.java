package strategy.context;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyTest {
    public StrategyTest() {

    }

    @Test
    void testStrategy() {
        Context context = new Context();

        // Выбор стратегии сложения
        context.setStrategy(new ConcreteStrategyAdd());
        assertEquals(2, context.executeStrategy(1, 1));

        // Выбор стратегии вычитания
        context.setStrategy(new ConcreteStrategySubtract());
        assertEquals(1, context.executeStrategy(4, 3));

        // Выбор стратегии умножения
        context.setStrategy(new ConcreteStrategyMultiply());
        assertEquals(30, context.executeStrategy(5, 6));
    }
}
