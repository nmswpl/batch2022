import java.util.Scanner;

public class ILargestNumberAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();

        if(num1 >= num2 && num1 >=num3)
        {
            System.out.println(num1 +" is the largest number");
        }
        else if(num2 >= num1 && num2 >=num3)
        {
            System.out.println(num2 +" is the largest number");
        }
        else
        {
            System.out.println(num3 +" is the largest number");

        }

    }
}
