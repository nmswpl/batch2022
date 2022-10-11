package in.co.nmsworks.exercise;
//6. Write a program to Swap two numbers using temporary variable
import java.util.Scanner;

public class SwapTwoNo {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter 1 st no : ");
        int n1 = in.nextInt();

        System.out.println("Enter 2 nd no : ");
        int n2 = in.nextInt();

        System.out.println("---Before Swap ------ "+n1+" , "+n2);
        int n3 ;
        n3 = n2;
        n2 = n1;
        n1 = n3;
        System.out.println("---After Swap ------ "+n1+" , "+n2);
    }
}
