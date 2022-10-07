package exercise2;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = get.nextInt();
        int b = get.nextInt();
        int c = get.nextInt();

        if(a>b && a>c)
            System.out.println(a+ " is greater");
        else if (b>a && b>c)
            System.out.println(b + " is greater");
        else
            System.out.println(c+" is greater");
    }
}
