// 19. Calculate the power of a number using a for loop. (E.g : 2 power 3 is 8 [2 x 2 x 2])
import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base Number : ");
        int base = input.nextInt();
        System.out.print("Enter Power : ");
        int power = input.nextInt();
        int temp=base;
        for(int i=1;i<power;i++){
            base = temp * base;
        }
        System.out.println("answer = "+base);

    }
}
