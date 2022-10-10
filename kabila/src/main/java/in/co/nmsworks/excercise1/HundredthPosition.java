package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class HundredthPosition {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = numbers.nextInt();
        int result=number/100;
        System.out.println(result);
        switch(result)
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
                System.out.println("null");
        }

    }
}
