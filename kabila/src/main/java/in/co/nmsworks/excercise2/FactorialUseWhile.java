package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class FactorialUseWhile {
    public static void main(String[] args) {
        int i=1,fact=1;
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = numbers.nextInt();
        while(i<=number){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
