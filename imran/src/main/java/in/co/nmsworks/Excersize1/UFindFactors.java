import java.util.Scanner;

public class UFindFactors {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();

        if(number > 0)
        {
            for(int i = 1 ; i <= number ; i++)
            {
                if(number % i == 0)
                {
                    System.out.print(i  +" ");
                }
            }
        }
        else
        {
            System.out.println("Please enter a positive number ");
        }
    }
}
