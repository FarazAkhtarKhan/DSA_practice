package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        FibonacciSeries fib = new FibonacciSeries();

        assertEquals(5, fib.fibonacci(5));

        assertEquals(8, fib.fibonacci(6));
    }
}