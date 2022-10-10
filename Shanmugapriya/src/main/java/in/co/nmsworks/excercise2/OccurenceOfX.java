package in.co.nmsworks.excercise2;

import java.util.Scanner;
//occurence of character
public class OccurenceOfX
{
    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,3};

        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number to search :");
        int num = S.nextInt();
        int count = 0;

        for ( int i = 0; i < array.length; i++)
        {
            if(num == array[i])
            {
                count++;
            }
        }
        System.out.println("The "+num+" occurs "+count+" times");
    }
}
