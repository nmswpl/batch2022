package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        int res = 1;
        System.out.println(" Enter power :");
        Scanner number = new Scanner(System.in);
        int  power = number.nextInt();
        System.out.println("Enter baseumber ");
        int  base = number.nextInt();

        for(int i=1;i<=power;i++){
            res *= base;
        }

        System.out.println(res);

    }
}
