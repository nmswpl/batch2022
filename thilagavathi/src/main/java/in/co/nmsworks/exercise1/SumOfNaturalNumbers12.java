//to print the sum of natural numbers(12)

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class SumOfNaturalNumbers12 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        int sum=0;
        for( i=0; i<=100; i++){
            sum=sum+i;
        }
        System.out.println("Sum:" +sum);
    }
}
