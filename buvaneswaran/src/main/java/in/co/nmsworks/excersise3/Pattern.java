package in.co.nmsworks.excersise3;

//import java.util.Scanner;



public class Pattern
{
    public static void main(String[] args)
    {
        int no=5;
        char num='a';
        for (int i = 0 ; i <= no ; i++)
        {
            for (int j=0 ; j<=i ;j++)
            {
                System.out.print(num);
            }
            num++;
            System.out.println(" ");
        }
    }
}
