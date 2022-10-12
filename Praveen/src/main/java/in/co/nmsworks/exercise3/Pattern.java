package in.co.nmsworks.exercise3;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a num:");
        int num=s.nextInt();
        int alphabet=97;
        for (int i = 0; i < num; i++) {
            for (int j =0; j <=i; j++) {

                System.out.print((char) alphabet+" ");
            }
            alphabet++;
            System.out.println();
        }
    }
}
