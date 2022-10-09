package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter number ");
        int number=in.nextInt();
        System.out.println("enter the power");
        int power=in.nextInt();
        int result=1;

        for(int i=1;i<=power;i++)
        {
            result=result*number;

        }
        System.out.println(result);
    }
}
