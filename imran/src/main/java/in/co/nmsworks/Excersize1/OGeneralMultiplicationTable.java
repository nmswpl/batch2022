import java.util.Scanner;

public class OGeneralMultiplicationTable {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        
        for(int i = 1; i <=10 ; i++)
        {
            int mul = number * i;
            System.out.println(number + " * "  + i + " = " +mul);
        }
    }
}
