package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class TableGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which table you want : ");
        int choice = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(choice + " * " + i + " = " + choice * i);
        }

    }

}


//  15. Generate Multiplication Table using for loop