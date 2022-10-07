package in.co.nmsworks.excercise1;
import  java.util.Scanner;
public class AddTwoIntegers {
    public static void main(String[] args) {
        int addingInput1,addingInput2;
        Scanner inputObject=new Scanner(System.in);
        System.out.println("Enter two numbers");
        addingInput1=inputObject.nextInt();
        addingInput2=inputObject.nextInt();
        System.out.println("The sum is: "+(addingInput1+addingInput2));
    }
}
