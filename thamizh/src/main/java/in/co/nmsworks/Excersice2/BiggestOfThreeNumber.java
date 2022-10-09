package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class BiggestOfThreeNumber {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 3 number");
        int num1=in.nextInt();
        int num2= in.nextInt();
        int num3=in.nextInt();

        if(num1<num2 && num3 < num2) {

            System.out.println(num2+" is greater");

        } else if (num3>num1 && num3>num2) {
            System.out.println(num3+" is greater");

        }
        else {
            System.out.println(num1+" is greater");
        }
    }
}
