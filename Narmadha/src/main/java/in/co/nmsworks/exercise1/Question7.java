package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //Check whether a number is even or odd using if...else statement
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();


        if(num % 2 == 0){
            System.out.println("It is an even number");

        }
        else{
            System.out.println("It is an odd number");
        }
    }
}
