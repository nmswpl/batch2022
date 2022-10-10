package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int n = number.nextInt();
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }

}
