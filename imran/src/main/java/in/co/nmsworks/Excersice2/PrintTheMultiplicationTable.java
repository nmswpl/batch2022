package in.co.nmsworks.Excersice2;


import java.util.Scanner;

public class PrintTheMultiplicationTable
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();

        for(int i = 1; i <=10 ; i++)
        {
            int mul = number * i;
            System.out.println(number + " * "  + i + " = " +mul);
        }
    }
}
