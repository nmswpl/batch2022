package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class Biggestof3
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("num1");
        int no1 = S.nextInt();

        System.out.println("num2");
        int no2 = S.nextInt();

        System.out.println("num3");
        int no3 = S.nextInt();

        if(no1 > no2)
        {
            if(no1 > no3) {
                System.out.println(no1 + " is greater");
            }
        }
        else if (no2 > no3)
        {
            if (no1 < no2 )
                System.out.println(no2+" is greater");
        }
        else
            System.out.println(no3+" is greater");

    }
}
