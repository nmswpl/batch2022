import java.util.Scanner;

public class SCalculatePowerOfANumberUsingForLoop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a base number : ");
        int base = inp.nextInt();

        System.out.print("Enter a power : ");
        int power = inp.nextInt();
        int answer = 1;
        for(int i = 0 ; i < power ; i++)
        {
           answer *=  base;
       
        }
        System.out.println("Answer = "+answer);
    }
}
