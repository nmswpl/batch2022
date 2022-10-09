package in.co.nmsworks.exercise2;
//Write a program using Recursion to find and print the factorial of a number.
public class Recursion {
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        else
        return (n*fact(n-1));
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    
}

