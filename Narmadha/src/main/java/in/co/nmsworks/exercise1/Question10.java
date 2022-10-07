package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        //program to Check if a Number is Positive or Negative using if else
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int number =sc.nextInt();
        if(number>0){
            System.out.println(number + " is positive number");
        }else if (number<0){
            System.out.println(number +" is negative number ");
        }
        else{
            System.out.println("it is zero");
        }
    }
}
