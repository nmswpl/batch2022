import java.util.Scanner;

public class Factorial {

    //Factorial using for loop
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = get.nextInt();
        int fact = 1;

        for (int i=1; i <= num ;i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
