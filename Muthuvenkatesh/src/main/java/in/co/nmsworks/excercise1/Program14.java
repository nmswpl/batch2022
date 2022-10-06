// 14. Write a program to Find Factorial of a number using while loop
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fact = 1;
        int i=1;
        while(number>=i){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" = " + fact);

    }
}
