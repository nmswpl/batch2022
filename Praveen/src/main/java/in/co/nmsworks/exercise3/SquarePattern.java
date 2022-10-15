package in.co.nmsworks.exercise3;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        square();
    }

    public static void square() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size-1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
