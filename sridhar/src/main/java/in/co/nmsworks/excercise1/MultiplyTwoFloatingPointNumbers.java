package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class MultiplyTwoFloatingPointNumbers {
    public static void main(String[] args) {
        float multiplyingInput1,multiplyingInput2;
        Scanner inputObject=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        multiplyingInput1=inputObject.nextFloat();
        multiplyingInput2=inputObject.nextFloat();
        System.out.println("The product is: "+(multiplyingInput1*multiplyingInput2));
    }
}
