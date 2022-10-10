//using if else to print the even or odd

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class EvenOrOdd7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num +" is a even number" );
        }
        else{
            System.out.println(num +" is an odd number");
        }
    }
}
