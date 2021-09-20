package singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SingletonTest {
    public SingletonTest() {
    }

    @Test
    @DisplayName("Singleton test")
    void testSingleton() {
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();

        assertTrue(singletonOne.equals(singletonTwo));
    }
}
