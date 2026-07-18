package sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        BubbleSort sort = new BubbleSort();
        int[] input = {13, 46, 24, 13, 20, 9};
        int[] expected = {9, 13, 13, 20, 24, 46};

        assertArrayEquals(expected, sort.bubbleSort(input));
    }
    @Test
    public void testsorted(){
        BubbleSort sort = new BubbleSort();
        int[] input = {2,3,4,5,6};
        int[] expected = {2,3,4,5,6};

        assertArrayEquals(expected, sort.bubbleSort(input));
    }
}