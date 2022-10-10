/*4. Write a program to print the position of given element in an array. If not present, print -1
E.g : Input : arr = {7, 15, 41}
Search Element : 41 Output : 2;
Search Element : 5 Output : -1

 */



package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class PositionOfNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find position:");
        int no = input.nextInt();
        int position = 0;
        int[] arr = {1, 4, 6, 2, 67, 43, 78, 84};

        for (int i = 0; i < arr.length; i++)
        {
            if (no == arr[i])
            {
                position=i;
                break;
            }
            else
            {
                position=-1;
            }
        }
        System.out.println("The given no position is:" + position);


    }
}
