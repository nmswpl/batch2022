// 18. Count Number of Digits in an Integer using while loop
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();
        int count =0;
        while (number>0){
            int temp = number%10;
            count++;
            number = number/10;

        }
        System.out.println("Number of digits: "+count);
    }
}
