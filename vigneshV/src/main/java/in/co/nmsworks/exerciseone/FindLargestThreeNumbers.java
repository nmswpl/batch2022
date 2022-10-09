package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class FindLargestThreeNumbers {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner inputObject=new Scanner(System.in);
        number1= inputObject.nextInt();
        number2= inputObject.nextInt();
        number3= inputObject.nextInt();
        if(number1>number2)
        {
            if(number1>number3)
            {
                System.out.println(number1+" is biggest Number");
            }
            else
            {
                System.out.println(number3+" is biggest number");
            }
        }
        else
        {
            if(number2>number3)
            {
                System.out.println(number2+" is biggest number");
            }
            else
            {
                System.out.println(number3+" is biggest number");
            }
        }
    }
}
