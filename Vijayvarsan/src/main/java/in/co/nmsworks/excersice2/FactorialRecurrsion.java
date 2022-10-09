package in.co.nmsworks.excersice2;

public class FactorialRecurrsion {
    //16. Write a program using Recursion to find and print the factorial of a number.
    //For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120

    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
