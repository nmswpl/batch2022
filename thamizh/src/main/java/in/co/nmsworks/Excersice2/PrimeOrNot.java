package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int x= in.nextInt();

        int count=0;

        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0) {
                count = 1;
                break;
            }
        }
        if(count==1)
            System.out.println(x+"  not is prime");
        else
            System.out.println(x+"  is prime");
    }
}
