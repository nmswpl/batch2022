package in.co.nmsworks.exercise3;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
     diamondprogram();
    }
    public static void diamondprogram()
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        for (int i = 0; i <=size; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = size; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }


}
