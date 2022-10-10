import java.util.Scanner;

//Sum of Natural numbers
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = get.nextInt();
        int sum =0 ;
        for (int i=0 ; i<=num;i++)
        {
            sum += i;
        }
        System.out.println("Sum : "+sum);
    }
}
