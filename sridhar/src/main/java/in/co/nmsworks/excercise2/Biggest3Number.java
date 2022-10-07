package in.co.nmsworks.excercise2;
import  java.util.Scanner;
public class Biggest3Number {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner inputObject=new Scanner(System.in);
        number1= inputObject.nextInt();
        number2= inputObject.nextInt();
        number3= inputObject.nextInt();
        if ( number1>number2)
        {
            if (number1>number3)
            {
                System.out.println("Biggest Number is : "+number1);
            }
            else
            {
                System.out.println("Biggest Number is : "+number3);
            }
        }
        else
        {
            if (number2>number3)
            {
                System.out.println("Biggest Number is : "+number2);
            }
            else
            {
                System.out.println("Biggest Number is : "+number3);
            }
        }
    }
}
