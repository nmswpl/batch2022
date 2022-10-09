package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class PassitiveOrNegative
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int number=sc.nextInt();sc.nextLine();
        if (number < 0)
            System.out.println(number + " is a negative number.");
        else if ( number > 0)
            System.out.println(number + " is a positive number.");
        else
            System.out.println(number + " is 0.");
    }
}
