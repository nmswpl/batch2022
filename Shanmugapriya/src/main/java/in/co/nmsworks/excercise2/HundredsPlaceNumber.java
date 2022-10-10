package in.co.nmsworks.excercise2;

import java.util.Scanner;
//find hundred place numbers
public class HundredsPlaceNumber
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = S.nextInt();

        int hundreds = (num/100)%10;

        System.out.println(hundreds);
    }
}
