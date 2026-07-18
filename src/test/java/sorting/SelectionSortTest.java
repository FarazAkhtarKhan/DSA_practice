package sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        SelectionSort sort = new SelectionSort();
        int[] input = {13, 46, 24, 13, 20, 9};
        int[] expected = {9, 13, 13, 20, 24, 46};

        assertArrayEquals(expected, sort.selectionSort(input));
    }
}