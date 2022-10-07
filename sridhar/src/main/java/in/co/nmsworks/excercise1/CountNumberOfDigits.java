package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class CountNumberOfDigits {
    public static void main(String[] args) {
        long findNumber,count=0;
        Scanner inputObject=new Scanner(System.in);
        findNumber=inputObject.nextLong();
        while (findNumber!=0)
        {
            count++;
            findNumber=findNumber/10;
        }
        System.out.println(count);
    }
}
