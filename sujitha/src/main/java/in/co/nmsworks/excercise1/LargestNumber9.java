/*9. Write a program to Find Largest Among three numbers using if..else statement.*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class LargestNumber9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int firstNumber = sc.nextInt();
        System.out.println("enter 2nd number");
        int secondNumber = sc.nextInt();
        System.out.println("enter third number");
        int thirdNumber = sc.nextInt();

        if (firstNumber > secondNumber & firstNumber > thirdNumber) {
            System.out.println(firstNumber + " is greater");
        } else if (secondNumber > thirdNumber) {
            System.out.println(secondNumber + " is greater");
        } else {
            System.out.println(thirdNumber + " is greater");
        }
    }
}
