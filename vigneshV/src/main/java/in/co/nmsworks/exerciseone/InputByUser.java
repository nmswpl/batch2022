package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class InputByUser {
    public static void main(String[] args) {
        int giveInputByUser;
        Scanner inputObject=new Scanner(System.in);
        System.out.print("Enter a number: ");
        giveInputByUser=inputObject.nextInt();
        System.out.println("You entered: "+giveInputByUser);
    }
}
