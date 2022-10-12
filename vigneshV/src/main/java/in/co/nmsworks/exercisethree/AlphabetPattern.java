package in.co.nmsworks.exercisethree;

import java.util.Scanner;

public class AlphabetPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }

    private static void pattern(int n)
    {
        int i;
        int j;
        for(i=1;i<n;i++)
        {
            for( j = 1; j<=i; j++)
            {
                System.out.print((char)(96+i));
            }
            System.out.println();
        }
    }
}
