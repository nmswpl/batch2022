package in.co.nmsworks.exercise1;

public class Program22
{
    public static void fibonacciSeriesUsingForLoop()
    {
        int num=10,n1=0,n2=1,n3;
        System.out.println("Fibonacci series terms" + num);
        System.out.print(n1+","+n2);
        for(int i=2;i<num;i++)
        {
            n3=n1+n2;
            System.out.print(","+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args)
    {
        fibonacciSeriesUsingForLoop();
    }
}
