package in.co.nmsworks.training.excercise1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int num,sum = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=0; i <= num ; i++)
        {
            sum += i;
        }
        System.out.println("sum of Natural number is "+sum);
    }

}
