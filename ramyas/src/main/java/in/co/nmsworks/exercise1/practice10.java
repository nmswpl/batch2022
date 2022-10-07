package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class practice10
{
    public static void main(String[] args)
    {
        System.out.println("ENTER A NUMBER: ");
        Scanner a = new Scanner(System.in);
        int no = a.nextInt();
        if(no<0)
        {
            System.out.println(no +" is Negative");
        }
        else
        {
            System.out.println(no +" is Positive");
        }
    }
}
