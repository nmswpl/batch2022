package exercise2;

//Finding the 100th position digit in the given number
import java.util.Scanner;

public class HundredPositionNumber {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = get.nextInt();

        int position = num/100;

        String[] numbers = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        System.out.println(numbers[position]);
    }
}
