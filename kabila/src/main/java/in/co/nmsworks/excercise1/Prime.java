package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int number1 = number.nextInt();
        int count=0;
        for(int i=2;i<number1;i++)
        {
            if(number1%i==0)
            {
                count=count++;
            }
        }
        if(count==0){
            System.out.println("prime");

        }
        else {
            System.out.println("not prime");
        }

}
}
