package in.co.nmsworks.training.practice;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = numbers.nextInt();
        if(number%2==0) {
            System.out.println(number + "is even");
          }
        else
        {
            System.out.println(number +"is odd");
        }

    }
}
