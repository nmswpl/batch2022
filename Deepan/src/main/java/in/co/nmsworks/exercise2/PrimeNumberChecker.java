package exercise2;


import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void check(int num)
    {
        int count = 0;
        for(int i=2 ; i <= num/2 ; i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }

        if (count == 0)
            System.out.println(num+ " is Prime");
        else
            System.out.println(num+ " is not a Prime");
    }


    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = get.nextInt();

        check(num);
    }
}
