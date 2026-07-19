package sorting;

public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            int j = i;
            while (j > 0 && (nums[j - 1] > nums[j])) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j=j-1;
            }
        }
        return nums;
    }
}

