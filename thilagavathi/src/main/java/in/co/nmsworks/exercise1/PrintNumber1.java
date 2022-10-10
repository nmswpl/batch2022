//to print a integer entered by the user(1)

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class PrintNumber1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a integer:");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("you entered a number is:"+n);
    }
}
