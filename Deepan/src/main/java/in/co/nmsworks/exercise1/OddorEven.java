import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        Scanner get =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = get.nextInt();

        if(num%2 == 0)
            System.out.println(num+" is Even");
        else
            System.out.println(num+" is Odd");
    }
}
