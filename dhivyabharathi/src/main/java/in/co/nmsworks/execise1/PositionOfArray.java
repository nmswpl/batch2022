package in.co.nmsworks.execise1;
//4. Write a program to print the position of given element in an array. If not present, print -1
import java.util.Scanner;

public class PositionOfArray
{
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = get.nextInt();

        int index =0 ;
        int GivenArray[] = {3,4,5,6,7,8};

        for (int i=0 ; i < GivenArray.length ; i++){

            if(num == GivenArray[i])
            {
                index = i;
            }
        }

        if (index > 0)
            System.out.println("Index of "+num+ " is "+index);
        else
            System.out.println(-1);

    }
}
