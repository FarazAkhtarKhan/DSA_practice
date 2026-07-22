package sorting;

public class MergeSortPractice {
    public int[] merge_sort() {
        int arr[] = {2, 3, 5};
        int arr2[] = {4, 7, 8};
        int newarr[] = new int[arr.length + arr2.length];
        int i = 0, j = 0, a = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] > arr2[j]) {
                newarr[a] = arr2[j];
                j++;
            } else {
                newarr[a] = arr[i];
                i++;
            }
            a += 1;
        }
        while(i<arr.length){
            newarr[a++] = arr[i++];
        }
        while(j<arr2.length){
            newarr[a++] = arr2[j++];
        }
        return newarr;
    }
}
