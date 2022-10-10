import java.util.Scanner;

public class AddNumbers {

    //Adding Two numbers
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = get.nextInt();
        int num2 = get.nextInt();
        int sum = num1 + num2;

        System.out.println("The sum is: "+sum);
    }
}

