package recursion;

public class FibonacciSeries {
    public void fibonacci(int n,int prev, int next){
        //Brute Force
//        int i = 0;
//        int prev =0;
//        int next = 1;
//        int sum =0;
//        System.out.printf("%d%d",prev,next);
//        while(sum<n){
//            sum = next + prev;
//            prev = next;
//            next = sum;
//            System.out.print(sum);
//        }

        //recursion
        if (prev > n) return;
        System.out.printf("%d,", prev);
        fibonacci(n, next, next+prev);
    }
}
