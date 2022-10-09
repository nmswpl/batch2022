package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class FactorOfPositiveInteger {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter positive");
        int number=in.nextInt();

        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
