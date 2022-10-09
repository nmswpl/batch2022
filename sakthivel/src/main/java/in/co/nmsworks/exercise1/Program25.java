package in.co.nmsworks.exercise1;

public class Program25
{
    public static int factorialOfANumberUsingRecursion(int n)
    {
        if( n ==0 || n==1)

            return 1;
            else
            return ( n * factorialOfANumberUsingRecursion(n-1));
    }

    public static void main(String[] args)
    {
        System.out.println(factorialOfANumberUsingRecursion(6));

    }
}
