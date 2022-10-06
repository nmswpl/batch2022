package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class OddEvenChecker {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        if( number % 2 == 0){
            System.out.println(number + " is a even number");
        }
        else {
            System.out.println(number + " is odd");
        }

    }

}

//  7. Check whether a number is even or odd using if...else statement