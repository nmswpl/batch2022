package in.co.nmsworks.exercise;
//23. Write a program to find Factorial of a Number Using Recursion
public class FactUsingRecursion {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);

        }
    }
    public static void main(String[] args) {
        int n=0;
        System.out.println(fact(n));


    }
}
