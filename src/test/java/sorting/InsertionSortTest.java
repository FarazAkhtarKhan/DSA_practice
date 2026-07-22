package sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        InsertionSort sort = new InsertionSort();
        int[] input = {7, 4, 1, 5, 3, 3};
        int[] expected = {1, 3, 3, 4, 5, 7};

        assertArrayEquals(expected, sort.insertionSort(input));
    }
}