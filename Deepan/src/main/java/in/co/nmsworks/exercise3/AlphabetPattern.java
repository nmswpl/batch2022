package in.co.nmsworks.exercise3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AlphabetPattern {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = get.nextInt();

        for (int i=1, n=97 ; i <=num ; i++)
        {
            for (int j=0 ; j < i ;j++)
            {
                System.out.print((char)n);
            }
            n++;
            System.out.println("");
        }
    }
}
