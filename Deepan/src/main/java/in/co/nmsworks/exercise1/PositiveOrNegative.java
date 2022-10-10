import java.util.Scanner;

//Finding the given is positive or not
public class PositiveOrNegative {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = get.nextInt();

        if(num>=0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
