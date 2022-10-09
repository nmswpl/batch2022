package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter digits");
        int digit = in.nextInt();

        int count=0;

        while (digit!=0)
        {
            count++;
            digit=digit/10;

        }
        System.out.println(count);
    }
}
