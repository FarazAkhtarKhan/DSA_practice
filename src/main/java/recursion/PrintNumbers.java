package recursion;

public class PrintNumbers {

    public void print_numbers(int n/**,int count**/) {
//        //1 to N
//        if (count <= n) {
//            System.out.println(count);
//            print_numbers(n,count+=1);
//        }


        //N to 1
        if(n==0)
            return;
        System.out.print(n);
        print_numbers(n-1);

    }
}
