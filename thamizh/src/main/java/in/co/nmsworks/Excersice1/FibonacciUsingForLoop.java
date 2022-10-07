package in.co.nmsworks.Excersice1;

import java.util.Scanner;

//16. Display Fibonacci Series Using for Loop

public class FibonacciUsingForLoop {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int n=in.nextInt();

        int n1=0;
        int n2=1;
        int n3;

        for(int i=0;i<n;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;

            System.out.println(n3);
        }
    }
}
