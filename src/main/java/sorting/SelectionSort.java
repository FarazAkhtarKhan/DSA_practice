package sorting;

public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        for(int i=0; i< nums.length-1;i++){
            int min =  i;
            for(int j = i+1; j < nums.length ; j++){
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return  nums;
    }
}
