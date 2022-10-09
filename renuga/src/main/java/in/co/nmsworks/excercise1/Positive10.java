package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class Positive10 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        number = sc.nextInt();
        if (number > 0)
        {
            System.out.println( number + "  is positive  " );
        }
        else if(number <0){
            System.out.println(number + " is negative : ");
        }
    }
}
