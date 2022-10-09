/*11. Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35*/
package in.co.nmsworks.exercisesets2;

import java.util.Scanner;

public class BiggestNumber11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int firstNumber= sc.nextInt();
        System.out.println("enter 2nd number");
        int secondNumber= sc.nextInt();
        System.out.println("enter third number");
        int thirdNumber= sc.nextInt();

        if(firstNumber>secondNumber & firstNumber>thirdNumber)
        {
            System.out.println(firstNumber+" is greater");
        }
        else if (secondNumber>thirdNumber)
        {
            System.out.println(secondNumber+" is greater");
        }
        else {
            System.out.println(thirdNumber+ " is greater");
        }
    }
}
