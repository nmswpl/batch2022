import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = get.nextInt();

        System.out.println("You entered: "+num);
    }
}
