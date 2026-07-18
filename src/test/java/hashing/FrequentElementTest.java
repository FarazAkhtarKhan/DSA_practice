package hashing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FrequentElementTest {
    @Test
    public void checkFrequencyELement() {
        FrequentElement freq = new FrequentElement();
        int []input = {1,3,4,5,4,13};
        assertEquals(4,freq.mostFrequentElement(input));
    }
}
