package in.co.nmsworks.excercise2;

import java.util.Scanner;
//Numbers between 301 and 400 divisible by 3
public class DivisibleBy3
{
    public static void main(String[] args) {

         int i;
        for ( i = 301; i < 400; i ++ )
        {
            if( i % 3 == 0)
            {
                System.out.println(i+"  is divisible by 3");
            }

        }
    }
}
