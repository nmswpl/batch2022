package in.co.nmsworks.exercise1;
import java.util.Scanner;
//Write a program to Find Factorial of a number using while loop
public class practice14
{
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int fact = 1;
        int i = 1;

        while (no>=i)
        {
            fact*=i;
            i++;
        }
        System.out.println("Factorial of "+no +" = "+fact);

    }
}
