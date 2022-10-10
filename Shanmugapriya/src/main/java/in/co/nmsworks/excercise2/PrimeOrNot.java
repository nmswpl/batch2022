package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class PrimeOrNot
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = S.nextInt();

        if (num % 2 == 0) {
            System.out.println("It is not Prime");
        } else {
            for (int i = 3; i < num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("It is not Prime");
                }
            }
            System.out.println(num + " is Prime");
        }
    }
}
