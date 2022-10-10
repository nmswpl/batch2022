package in.co.nmsworks.excercise2;

import java.util.Scanner;
//Position of element
public class PositionOfElement
{
    public static void main(String[] args) {
        int[] arr = {7,15,41};

        Scanner S = new Scanner(System.in);
        System.out.println("Search Element :");
        int num = S.nextInt();
        int i ;
        int count = 0;

        for ( i = 0; i < arr.length; i++)
        {
            if( arr[i] == num)
            {
                System.out.println("The Element is found in " + i);
                break;
            }
            else
                count++;

        }
        if(count >= arr.length)
            System.out.println("The Element is not found -1");
    }
}
