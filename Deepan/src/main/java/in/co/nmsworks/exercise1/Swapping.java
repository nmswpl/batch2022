import java.util.Scanner;

//Swapping two numbers
public class Swapping {
    public static void main(String[] args) {
        Scanner get =new Scanner(System.in);

        System.out.println("Enter A and B:");
        int num1 = get.nextInt();
        int num2 = get.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp ;

        System.out.println("A: "+num1);
        System.out.println("B: "+num2);
    }
}
