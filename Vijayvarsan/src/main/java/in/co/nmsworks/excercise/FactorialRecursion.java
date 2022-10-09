package in.co.nmsworks.excercise;

public class FactorialRecursion {
    //23. Write a program to find Factorial of a Number Using Recursion


    static int fact(int n)
    {
        if (n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));
    }
}
