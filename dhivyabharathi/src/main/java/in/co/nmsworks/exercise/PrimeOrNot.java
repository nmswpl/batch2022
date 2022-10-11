package in.co.nmsworks.exercise;
//21. Write a program to Check Prime Number using a for loop
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

    int count = 0;
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
    int CheckNo = in.nextInt();
        for (int i = 1; i <CheckNo ; i++) {
        if(CheckNo%i ==0)
        {
            count++;
        }
    }
        if(count<=2)
    {
        System.out.println("Given no is prime : "+CheckNo);
    }
        else {
        System.out.println("Given no is non prime : "+CheckNo);
    }
}
}
