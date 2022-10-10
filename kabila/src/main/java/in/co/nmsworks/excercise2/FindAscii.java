package in.co.nmsworks.training.practice;

import java.util.Scanner;

public class FindAscii
{
    public static void main(String[] args)
    {
        Scanner chr = new Scanner(System.in);
        System.out.println("Enter a character ");
        char ctr= chr.next().charAt(0);
        int value=ctr;
        System.out.println("value= " +value);

    }
}
//char='q';
//int ctr=char;