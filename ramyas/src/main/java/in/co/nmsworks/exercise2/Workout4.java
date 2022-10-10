package in.co.nmsworks.exercise2;

import java.util.Scanner;

//. Write a program to print the position of given element in an array. If not present, print -1
//E.g : Input : arr = {7, 15, 41}
//Search Element : 41 Output : 2;
//Search Element : 5 Output : -1
public class Workout4
{
    public static void main(String[] args) {

        int[] arr = {23,34,67,12,10};

        System.out.println("SEARCH ELEMENT : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int index = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==no)
            {
                index = i;
                break;
            }
            else
            {
                index = -1;
            }
        }
        System.out.println(index);

    }
}
