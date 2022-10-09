package in.co.nmsworks.excersise1;

public class FibbonacciSeries
{
    public static void main(String[] args)
    {
        int n = 10, n1 = 0, n2 = 1;
        System.out.println("Fibonacci Series : " + n);

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(n1 + ", ");
            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
