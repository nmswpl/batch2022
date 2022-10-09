package in.co.nmsworks.Excersice2;

public class Recurssion {

    //16. Write a program using Recursion to find and print the factorial of a number.

    public static  int fact(int n)
    {
        if(n==1)
            return  1;
        else
            return (n*fact(n-1));
    }

    public static void main(String[] args) {
        System.out.println(  fact(5));
    }
}
