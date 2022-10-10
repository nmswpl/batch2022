/*18. Count Number of Digits in an Integer using while loop*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class NoOfDigits18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int a= sc.nextInt();
        int count=0;
        while (a!=0)
        {
            a/=10;
            count++;
        }
        System.out.println(count);
    }
}
