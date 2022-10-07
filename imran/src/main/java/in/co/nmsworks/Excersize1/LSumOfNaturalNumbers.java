import java.util.Scanner;

public class LSumOfNaturalNumbers 
{
    
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        int sum = 0;
        for(int i = 0;i <=100;i++)
        {
            sum += i;
        }
        System.out.println("Sum of " +number + " numbers = " +sum);
    }
   
}
