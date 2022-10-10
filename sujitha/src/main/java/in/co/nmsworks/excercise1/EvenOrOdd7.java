/*7. Check whether a number is even or odd using if...else statement*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class EvenOrOdd7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a= sc.nextInt();
        if(a%2==0)
        {
            System.out.println(a+" is even");
        }
        else
        {
            System.out.println(a+" is odd");
        }
    }



}
