package in.co.nmsworks.exercisetwo;

import java.util.Scanner;

public class PrimeNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isprime(n))
            System.out.println(n+" prime NUmber");
        else
            System.out.println("Not a prime");

    }

    private static boolean isprime(int n) {
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
