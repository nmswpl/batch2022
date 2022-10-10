package in.co.nmsworks.exercise1;

import java.util.Scanner;

//Print an Integer entered by the User
public class PrintInt {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        System.out.println("Enter a number:");

        System.out.println("You entered:"+number);
    }
}


