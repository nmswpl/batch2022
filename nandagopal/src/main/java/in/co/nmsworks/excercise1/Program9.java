package in.co.nmsworks.excercise1;

import java.util.Scanner;

//largest among three numbers
public class Program9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = in.nextInt();
        System.out.println("Enter Third number : ");
        int num3 = in.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the Largest");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the Largest");
        }
        else {
            System.out.println(num3 + " is the Largest");
        }
    }
}
