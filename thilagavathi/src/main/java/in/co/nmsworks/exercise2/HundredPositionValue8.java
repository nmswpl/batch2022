//a program for to print the hundred position value(8)

package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class HundredPositionValue8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hundreds = 0;

        System.out.print("Enter a 3 digit number: ");
        int number = sc.nextInt();

        hundreds = number / 100;
        System.out.printf("Hundreds place digit: ", +hundreds);


    }
}


