package recursion;

public class PrintNames {
    public void print_names(int n) {
        if (n > 0) {
            System.out.println("Faraz");
            n -= 1;
            print_names(n);
        }
    }
}