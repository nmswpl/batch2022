package in.co.nmsworks.exercise4;

import java.util.Scanner;
// triangle pattern
public class Pattern
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("pattern : ");
        int number = input.nextInt();
        char character = 'a';
        for (int i = 1;i<=number;i ++)
        {
            for (int j = 1;j<i+1;j ++)
            {
                System.out.print(character + " ");
            }
            character++;
            System.out.println("");
        }
    }
}
