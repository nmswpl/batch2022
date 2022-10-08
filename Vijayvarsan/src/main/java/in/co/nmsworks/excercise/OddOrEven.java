package in.co.nmsworks.excercise;

import java.util.Scanner;

public class OddOrEven {
    //7.Check whether a number is even or odd using if...else statement

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("find the number is even or odd");
        int check= scan.nextInt();
        if(check%2==0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
    }
}
