package in.co.nmsworks.exercise2;

import java.util.Scanner;

//.Given a 3 digit number, write a program to print the hundred position value in words.
//E.g 1: Input : 542 Output : Five.
//E.g 2: Input : 777 Output : Seven
public class Workout8
{
    public static void main(String[] args)
    {
        System.out.println("ENTER NO : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int hundred = no/100;
        switch (hundred)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("zero");
                break;

        }

    }
}
