//program to find Factorial of a Number Using Recursion
public class RecursionFactorial {
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return (n*fact(n-1));
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(fact(n));
    }

}
