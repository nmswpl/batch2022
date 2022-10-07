package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int giveTable;
        Scanner inputObject=new Scanner(System.in);
        giveTable=inputObject.nextInt();
        for (int i=1; i<=10; i++)
        {
            System.out.println(giveTable+" * "+i+" = "+(giveTable*i));
        }
    }
}
