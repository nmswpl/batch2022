package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int range,sum=0;
        Scanner inputObject=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        range= inputObject.nextInt();
        for (int i=1;i<=range;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}
