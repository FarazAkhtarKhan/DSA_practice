package recursion;

public class SumOfNumbers {
    public void sum_of_numbers(int n, int sum)
    {
        sum=sum+n;
        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        sum_of_numbers(n-1,sum);
    }
}
