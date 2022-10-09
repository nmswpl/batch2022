package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program5
{
    public static void oddOrEven()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int a= sc.nextInt();
        if(a %2==0) {
            System.out.println(a + " is even number");
        }
        else {
            System.out.println(a + " is odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven();
    }
}
