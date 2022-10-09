package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class BiggestOfThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int no1= input.nextInt();
        int no2= input.nextInt();
        int no3= input.nextInt();
        if(no1>no2&&no1>no3)
        {
            System.out.println(no1);
        }
        else if (no2>no1&&no2>no3)
        {
            System.out.println(no2);

        }
        else {
            System.out.println(no3);
        }

    }
}
