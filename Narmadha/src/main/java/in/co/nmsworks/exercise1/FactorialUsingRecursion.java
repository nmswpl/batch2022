package in.co.nmsworks.exercise1;

public class FactorialUsingRecursion {
    //Write a program to find Factorial of a Number Using Recursion
    public static void main(String[] args) {
        int num=6;
        long result=factorial(num);
        System.out.println(result);

    }
    public static long factorial(int num){
        if (num>=1){
            return num*factorial(num-1);
        }
        else{
            return 1;
        }
    }
}
