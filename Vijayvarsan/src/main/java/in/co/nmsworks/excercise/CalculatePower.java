package in.co.nmsworks.excercise;

import java.util.Scanner;

public class CalculatePower {
// 19. Calculate the power of a number using a for loop. (E.g : 2 power 3 is 8 [2 x 2 x 2])

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("CALCULATE THE POWER OF THE A NUMBER");
        System.out.println("ENTER THE BASE NUMBER");
        int base = scan.nextInt();
        System.out.println("ENTER POWER OF THE NUMBER");
        int power = scan.nextInt();
        int value=1;

        for(int i=0;i<power;i++)
        {
            value *=base;
        }
        System.out.println("VALUE"+value);
    }
}
