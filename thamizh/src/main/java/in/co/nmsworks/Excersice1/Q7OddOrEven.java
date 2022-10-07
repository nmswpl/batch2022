package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class Q7OddOrEven {

    //7. Check whether a number is even or odd using if...else statement

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a= sc.nextInt();

        if(a%2==0)
        {
            System.out.println(a+"  is an even number");
        }
        else
        {
            System.out.println(a+"  is odd");
        }
    }
}
