package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class PowOfMethod
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();sc.nextLine();
        int exponent=sc.nextInt();sc.nextLine();
        System.out.println(Math.pow(base,exponent));
    }
}
