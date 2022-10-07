package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        float firstNumber,secondNumber,temp;
        Scanner inputObject=new Scanner(System.in);
        firstNumber= inputObject.nextFloat();
        secondNumber= inputObject.nextFloat();
        System.out.println("--Before swap--"+"\n"+
                "First number = "+firstNumber+"\n"+
                "Second number = "+secondNumber);
        temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;
        System.out.println("--After swap--"+"\n"+
                "First number = "+firstNumber+"\n"+
                "Second number = "+secondNumber);
    }
}
