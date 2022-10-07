package in.co.nmsworks.excercise1;
import  java.util.Scanner;
public class PowerOfNumberUsingFor {
    public static void main(String[] args) {
        int baseNumber,powerNumber,total=1;
        Scanner inputObject=new Scanner(System.in);
        System.out.print("Enter Base Number:");
        baseNumber= inputObject.nextInt();
        System.out.print("Enter Power Number:");
        powerNumber= inputObject.nextInt();
        for (int i=1; i<=powerNumber; i++)
        {
            total=total*baseNumber;
        }
        System.out.println("Answer = "+total);
    }
}
