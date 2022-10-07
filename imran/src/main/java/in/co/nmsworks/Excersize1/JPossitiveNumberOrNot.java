import java.util.Scanner;

public class JPossitiveNumberOrNot {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        if(number > 0)
        {
            System.out.println(number + " is possitive number");
        }
        else
        {
            System.out.println(number + " is Negative number");

        }
    }
}
