package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class HundredPositionInWord {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter three digit number :");
        int number=in.nextInt();

        int result=number/100;

        switch (result)
        {
            case 1:
                System.out.println("one");
                break;
            case  2:
                System.out.println("two");
                break;
            case  3:
                System.out.println("three");
                break;
            case  4:
                System.out.println("four");
                break;
            case  5:
                System.out.println("five");
                break;
            case  6:
                System.out.println("six");
                break;
            case  7:
                System.out.println("seven");
                break;
            case  8:
                System.out.println("eight");
                break;
            case  9:
                System.out.println("nine");
                break;

            default:
                System.out.println("enter proper number");
                break;

        }
    }
}
