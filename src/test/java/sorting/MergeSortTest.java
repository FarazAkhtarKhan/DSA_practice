package sorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class MergeSortTest {
    @Test
    public void mergesorttest(){
        MergeSort mergeSort = new MergeSort();
        int []expected = {2,3,4,5,7,8};
        assertArrayEquals(expected,mergeSort.merge_sort());

    }
}
