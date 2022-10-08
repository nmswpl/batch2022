package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class HundredPrinter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int hundredValue = number/100;
        switch (hundredValue){
            case 1 :
                System.out.println("ONE");
                break;
            case 2 :
                System.out.println("TWO");
                break;
            case 3 :
                System.out.println("THREE");
                break;
            case 4 :
                System.out.println("FOUR");
                break;
            case 5 :
                System.out.println("FIVE");
                break;
            case 6 :
                System.out.println("SIX");
                break;
            case 7 :
                System.out.println("SEVEN");
                break;
            case 8 :
                System.out.println("EIGHT");
                break;
            case 9 :
                System.out.println("NINE");
                break;
            default:
                System.out.println("ENTER THREE DIGIT VALUE");
        }
    }
}

//  8.Given a 3-digit number, write a program to print the hundred position value in words.