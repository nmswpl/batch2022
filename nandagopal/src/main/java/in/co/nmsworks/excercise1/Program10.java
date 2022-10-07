package in.co.nmsworks.excercise1;

import java.util.Scanner;

//check the number is positive or negative
public class Program10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();

        if(num > 0) {
            System.out.println(num + " is positive number");
        }
        else {
            System.out.println(num + " is negative number");
        }
    }
}
