package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class LargestAmongThreeNumbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int n1=sc.nextInt();sc.nextLine();
        int n2= sc.nextInt();sc.nextLine();
        int n3= sc.nextInt();sc.nextLine();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
