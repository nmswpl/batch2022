package in.co.nmsworks.exercisetwo;

import java.util.Scanner;



public class Factorial {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    private static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);



    }


}
