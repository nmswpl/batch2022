package in.co.nmsworks.exersice5;

import java.util.Scanner;

public class PatternOfAlphabets {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int num=in.nextInt();

        int alphabet=97;

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)alphabet+" ");


            }
            alphabet++;
            System.out.println("\n");

        }
    }
}
