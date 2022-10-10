//to check prime number using for loop(21)

package in.co.nmsworks.exercise1;
import java.util.Scanner;

public class PrimeNumber21 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
