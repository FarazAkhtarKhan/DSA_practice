package sorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testMergeSortEdgeCases() {
        MergeSort mergeSort = new MergeSort();

        // 1. Single Element Array (Base Case Test)
        int[] single = {5};
        assertArrayEquals(new int[]{5}, mergeSort.mergeSort(single));

        // 2. Empty Array
        int[] empty = {};
        assertArrayEquals(new int[]{}, mergeSort.mergeSort(empty));

        // 3. Already Sorted Array
        int[] sorted = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, mergeSort.mergeSort(sorted));

        // 4. Reverse Sorted Array
        int[] reverse = {9, 7, 5, 3, 1};
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, mergeSort.mergeSort(reverse));

        // 5. Array with Duplicate Values
        int[] duplicates = {4, 2, 4, 1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 4}, mergeSort.mergeSort(duplicates));

        // 6. Array with Negative Numbers
        int[] negatives = {-3, 10, -8, 0, 5, -1};
        assertArrayEquals(new int[]{-8, -3, -1, 0, 5, 10}, mergeSort.mergeSort(negatives));
    }
}