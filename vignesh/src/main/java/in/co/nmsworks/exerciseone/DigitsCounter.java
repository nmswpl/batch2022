package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class DigitsCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit to count :");
        int n = sc.nextInt();
        int numberCopy = n;
        int digitCounter = 0;
        while (n != 0){
            n = n /10;
            digitCounter++;
        }
        System.out.println("No of digits in "+ numberCopy +" = " +digitCounter);

    }

}


//  18. Count Number of Digits in an Integer using while loop