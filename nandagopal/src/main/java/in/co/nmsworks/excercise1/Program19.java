package in.co.nmsworks.excercise1;

import java.util.Scanner;

// calculate the power of the number using for loop
public class Program19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base number : ");
        int base = in.nextInt();
        int temp = base;
        System.out.println("Enter power : ");
        int power = in.nextInt();
        if(power == 0) {
            System.out.println("Answer = 0");
            return;
        }

        for(int i=0; i<power-1; i++) {
            base *= temp;
        }

        System.out.println("Answer = " + base);
    }
}
