package in.co.nmsworks.execise1;

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
