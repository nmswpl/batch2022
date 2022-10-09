package in.co.nmsworks.excersise;
import java.util.Scanner;
public class MultiplyTwoFloatingPointNumbers
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the first data");
        float firstFloatValue = obj.nextFloat();
        System.out.println("enter the sec data");
        float secondFloatValue = obj.nextFloat();
        firstFloatValue*=secondFloatValue;
        System.out.println("multiple of two float value is "+ firstFloatValue);


    }
}
