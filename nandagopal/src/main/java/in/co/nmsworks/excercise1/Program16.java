package in.co.nmsworks.excercise1;

import java.util.Scanner;

// fibonacci series using for loop
public class Program16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();

        int firstNum = 0;
        int secondNum = 1;

        System.out.print("Fibonacci series till " + n + " terms : ");
        for(int i=1; i<=n; i++) {
            System.out.print(firstNum + ", ");
            int temp = firstNum;
            firstNum = secondNum;
            secondNum += temp;
        }
    }
}
