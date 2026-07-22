package sorting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class MergeSortTest {
    @Test
    public void mergesort(){
        MergeSortPractice mergeSort = new MergeSortPractice();
        int []expected = {2,3,4,5,7,8};
        assertArrayEquals(expected,mergeSort.merge_sort());

    }
}
