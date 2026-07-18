package recursion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SumOfNumbersTest {
    @Test
    public void testSumOfFirstN(){
        SumOfNumbers sum = new SumOfNumbers();
        assertEquals(15, sum.sum_of_numbers(5));
        assertEquals(21, sum.sum_of_numbers(6));
    }
    @Test
    public void testBaseCase(){
        SumOfNumbers sum = new SumOfNumbers();
        //to test the base case
        assertEquals(1,sum.sum_of_numbers(1));
    }
}
