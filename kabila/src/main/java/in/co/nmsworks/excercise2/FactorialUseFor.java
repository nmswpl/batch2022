package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class FactorialUseFor {
    public static void main(String[] args) {

        int i,fact=1;
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = numbers.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }
}
