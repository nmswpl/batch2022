package in.co.nmsworks.exercise3;

import java.util.Scanner;

public class PatterAlp {
    public static void main(String[] args) {

        int num =6;
        char a='A';
        for (int i =1; i <=num; i++)
        {
            for (char j =1; j<=i ; j++)
            {
                System.out.print(a);
            }
            System.out.println();
            a++;
        }
    }
}