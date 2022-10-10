import java.util.Scanner;

public class FactorsOfPositiveNumber {

    //Finding factors of a positive number
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = get.nextInt();

        for(int i=1 ; i <= num;i++)
        {
            if(num%i == 0)
            {
                System.out.print(" "+i);
            }
        }
    }
}
