package in.co.nmsworks.excercise1;

public class Factorial1
{
    static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args)
    {
      int n=5;
        System.out.println(fact(n));
    }
}
