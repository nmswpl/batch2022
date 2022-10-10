package in.co.nmsworks.excercise1;// 19. Calculate the power of a number using a for loop. (E.g : 2 power 3 is 8 [2 x 2 x 2])
import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base Number : ");
        int base = input.nextInt();
        System.out.print("Enter Power : ");
        int power = input.nextInt();
        int temp= 1;
        for(int i= 0; i<power;i++){
            temp = temp * base;
        }
        System.out.println("answer = "+temp);

    }
}
