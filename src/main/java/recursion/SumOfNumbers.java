package recursion;

public class SumOfNumbers {
    public int sum_of_numbers(int n) {
//        sum=sum+n;
//        if(n==0)
//        {
//            System.out.println(sum);
//            return;
//        }
//        sum_of_numbers(n-1,sum);
        if (n == 1) {
            return 1;
        }
        return sum_of_numbers(n-1) + n;
    }
}
