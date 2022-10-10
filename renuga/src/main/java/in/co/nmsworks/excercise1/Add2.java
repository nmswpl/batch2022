package in.co.nmsworks.excercise1;

/*2. Write a Program to Add Two Integers*/
import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        int number1, number2, sum;
       Scanner input = new Scanner(System.in) ;
        System.out.println("Enter  number");
       number1=input.nextInt();
        System.out.println("you enter num : "+ number1);
        System.out.println("Enter  number");
       number2=input.nextInt();
        System.out.println("you enter num : "+ number2);
       sum=number1+number2;


        System.out.println("sum is : "+sum);


    }
}
