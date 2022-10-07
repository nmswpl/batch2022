package in.co.nmsworks.excercise;

import java.util.Scanner;

public class MultiplyFloat {
    // 3. Write a program to Multiply Two Floating-Point Numbers
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("MULTIPLY TO FLOATING POINT NUMBER");
        float value1 =scan.nextFloat();
        float value2 =scan.nextFloat();
        System.out.println("THE MULTIPLY VALUE IS = " + (value1 * value2));
    }
}
