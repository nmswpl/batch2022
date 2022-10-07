package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Number :");
        int base = sc.nextInt();
        int ans = 1;
        System.out.println("Enter the Power Number : ");
        int power = sc.nextInt();
        for (int i = 0; i < power; i++) {
            ans *= base;
        }
        System.out.print("Answer : " + ans);

    }
}


//   19. Calculate the power of a number using a for loop. (E.g : 2 power 3 is 8 [2 x 2 x 2])