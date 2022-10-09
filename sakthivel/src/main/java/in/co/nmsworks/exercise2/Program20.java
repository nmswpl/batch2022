package in.co.nmsworks.exercise2;

public class Program20
{
    public static int recursionUsingFactorial(int n)
    {
        if(n==0 ||n==1)
        {
            return 1;
        }
        else {
            return (n*recursionUsingFactorial(n-1));
        }
    }

    public static void main(String[] args)
    {
        System.out.println(recursionUsingFactorial(6));
    }
}
