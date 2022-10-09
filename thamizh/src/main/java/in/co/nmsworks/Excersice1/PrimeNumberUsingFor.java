package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class PrimeNumberUsingFor {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int number=in.nextInt();

        int count=0;

        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                count=1;
                break;

            }

        }

        if(count==1)
        {
            System.out.println(number+" is not prime number");
        }
        else {
            System.out.println(number+" is prime number");
        }

        //System.out.println(count);
    }
}
