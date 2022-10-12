package in.co.nmsworks.excercise3;

import java.util.Scanner;

public class PrintingCharacters
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of Character :");
        int num = S.nextInt();

        for(int i = 0 ; i < num; i++)
        {
            for(int j = 0 ; j <= i; j++)
            {
                char ch = (char)(65+i);
                ch = Character.toLowerCase(ch);
                System.out.print(" "+ch);
            }
            System.out.println();
        }
    }
}
