package sorting;

public class MergeSort {
    public int[] mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int mid = nums.length/2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];
        for (int i = 0; i < mid; i++) { //avoided in build function
            left[i] = nums[i];
        }
        for (int i = mid; i < nums.length; i++) {
            right[i-mid] = nums[i]; // i - mid to set the index, and store the correct mid-value.
        }
        //divide
        int[] left_sorted = mergeSort(left);
        int[] right_sorted = mergeSort(right);
        //merge
        return merge(left_sorted, right_sorted);
    }
    //helper function, merging happens here.
    public int[] merge(int[] left, int[] right) {
        int newarr[] = new int[left.length + right.length];
        int i = 0, j = 0, a = 0;
        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                newarr[a] = right[j];
                j++;
            } else {
                newarr[a] = left[i];
                i++;
            }
            a += 1;
        }
        while (i < left.length) {
            newarr[a++] = left[i++];
        }
        while (j < right.length) {
            newarr[a++] = right[j++];
        }
        return newarr;
    }
}
