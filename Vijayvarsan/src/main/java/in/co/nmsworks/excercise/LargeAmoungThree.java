package in.co.nmsworks.excercise;

import java.util.Scanner;

public class LargeAmoungThree {
    //9. Write a program to Find Largest Among three numbers using if..else statement.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("LARGEST AMOUNG THREE NUMBERS");
        System.out.println("1ST NO");
        int a = scan.nextInt();
        System.out.println("2ST NO");
        int b = scan.nextInt();
        System.out.println("3ST NO");
        int c = scan.nextInt();

        if (a>b && a>c)
            System.out.println("the big value is = "+a);
        else if (b>c&&b>a)
            System.out.println("the big vaue is = "+b);
        else
            System.out.println("the big value is = "+c);
    }
}
