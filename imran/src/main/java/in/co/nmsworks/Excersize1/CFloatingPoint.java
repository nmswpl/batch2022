import java.util.Scanner;

public class CFloatingPoint
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter two float numbers : ");
        float num1 = inp.nextFloat();
        float num2 = inp.nextFloat();
        float product = num1 * num2;
        System.out.println("The product is : "+product);
    }
}