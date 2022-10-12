package in.co.nmsworks.Excercise5;

import java.util.Scanner;

public class PrintingPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = inp.nextInt();
        char alp = 'a';

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alp + " ");
            }

            alp++;
            System.out.println();

        }

    }
}
