package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class Tables {

    //15. Generate Multiplication Table using for loop

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter num");
        int n= in.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(i*n));
        }
    }
}
