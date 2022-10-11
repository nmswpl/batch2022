package in.co.nmsworks.exercise;
//15. Generate Multiplication Table using for loop
import java.util.Scanner;

public class TableOf_5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Number");
        int MultiplyNo = in.nextInt();
        int Value;
        for (int i = 1; i <=10 ; i++)
        {
            Value = MultiplyNo*i;

            System.out.println(i+" * " +MultiplyNo+" = "+Value);
        }
    }
}
