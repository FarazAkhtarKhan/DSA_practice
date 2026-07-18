package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testBaseCase() {
        Factorial fact = new Factorial();
        // assertEquals(EXPECTED_VALUE, ACTUAL_METHOD_CALL)
        // Testing factorial of 0, which should strictly return 1
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void testPositiveNumbers() {
        Factorial fact = new Factorial();
        assertEquals(120, fact.factorial(5));
        assertEquals(720, fact.factorial(6));
        assertEquals(3628800, fact.factorial(10));
    }
}