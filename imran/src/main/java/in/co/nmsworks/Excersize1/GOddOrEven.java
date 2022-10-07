import java.util.Scanner;

public class GOddOrEven {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        if(number % 2 == 0)
        {
            System.out.println(number +" is Even number ");
        }
        else
        {
            System.out.println(number +" is Odd number ");

        }
    }
}
