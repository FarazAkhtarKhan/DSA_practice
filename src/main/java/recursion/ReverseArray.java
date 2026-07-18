package recursion;

public class ReverseArray {
    public void reverse(int arr[],int i) {
        //BruteForce
//        int n = arr.length;
//        int temp_arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            temp_arr[i] = arr[(n-i)-1];
//            System.out.print(temp_arr[i]+" ");
//        }

        //Using Brute Force Recursion
//        if (start >= end)
//            return;
//        int temp=arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        reverse(arr,start+1, end-1);

        //Using Single Variable
        int n = arr.length;
        if (i >=n/2)
            return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverse(arr,i+1);
    }
}

