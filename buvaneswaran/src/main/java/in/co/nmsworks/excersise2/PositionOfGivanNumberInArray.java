package in.co.nmsworks.excersise2;

import java.util.Scanner;


//Write a program to print the position of given element in an array. If not present, print -1
public class PositionOfGivanNumberInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int no=sc.nextInt();sc.nextLine();
        int[] a={10,6,8};
        int temp=-1;
        for (int i=0;i<a.length;i++)
        {
            if(no==a[i]) {
                temp = i;
                break;
            }
        }
        if(temp == -1)
        {
            System.out.println("element is fount :" + temp);
        }
        else
            System.out.println("Element is not found :" + a[temp]);
    }
}
