package in.co.nmsworks.exercise1;

//Write a program to Find Factorial of a number using while loop

public class problem14 {
    public static void main(String[] args) {


        int n = 5;
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println(n+ " factorial number is "+fact);
    }
}
