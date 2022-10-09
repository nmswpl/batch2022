package in.co.nmsworks.execise1;

import java.util.Scanner;

public class PositionOfArray
{
    public static void main(String[] args)
    {
        int GivenArray [] = {4,5,6,2};
        int count =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Check No");
        int CheckNo = in.nextInt();
        for (int i = 0; i < GivenArray.length; i++) {
            if (CheckNo == GivenArray[i]) {
                System.out.println(i);
                break;
            }
            else
            {
                count++;
            }

        }
        if(count != 0)
        {
            System.out.println(-1);
        }



    }
}
