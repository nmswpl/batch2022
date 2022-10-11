package in.co.nmsworks.excercise2;

/*9.Write a program to print all numbers divisble by 3 greater than 300 and less than 400*/

import java.util.Scanner;

public class Divisible9 {
    public static void main(String ar[])
    { int i;
        System.out.println(" divisible by 7 in between 100 and 200");
        for(i=300;i<=400;i++)
        {
            if(i%3==0)
                System.out.print(i +" , ");
        }
    }
}
