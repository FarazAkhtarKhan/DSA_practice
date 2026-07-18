package recursion;

public class FibonacciSeries {
    public int fibonacci(int n) {
        //recursion
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public void brutefibonacci(int n) {
        //Brute Force
        int i = 0;
        int prev = 0;
        int next = 1;
        int sum = 0;
        System.out.printf("%d%d", prev, next);
        while (sum < n) {
            sum = next + prev;
            prev = next;
            next = sum;
            System.out.print(sum);
        }
    }
}
