//to print the fibonacci series(16)

package in.co.nmsworks.exercise1;

public class FibonacciSeries16 {
    public static void main(String[] args) {
        int n = 10, n1 = 0, n2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + ",");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
