package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SingletonTest {
    public SingletonTest() {
    }

    @Test
    void testSingleton() {
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();

        assertTrue(singletonOne.equals(singletonTwo));
    }
}
