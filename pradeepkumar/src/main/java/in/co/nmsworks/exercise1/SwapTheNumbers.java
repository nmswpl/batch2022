package in.co.nmsworks.exercise1;
import java.util.Scanner;

public class SwapTheNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  first number ");
        int n1= sc.nextInt();

        System.out.println("Enter the second number");
        int n2= sc.nextInt();

        System.out.println("Before Swap");
        System.out.println("First Number=" + n1);
        System.out.println("Second Number=" + n2);

        int temp;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After Swapping");
        System.out.println("First Number = " + n1);
        System.out.println("Second Number =" + n2);
    }
}
