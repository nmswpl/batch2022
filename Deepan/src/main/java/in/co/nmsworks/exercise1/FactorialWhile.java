import java.util.Scanner;

public class FactorialWhile {

    //Factorial using while loop
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = get.nextInt();
        int fact =1;
        int i=1;
        while(i <= num)
        {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
