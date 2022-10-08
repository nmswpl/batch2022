package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class PrintThePositionOfGivenElement {
    public static void main(String[] args) {
        Scanner  inp = new Scanner(System.in);
        int[] arr = {7,15,41};

        System.out.print("Enter search Element : ");
        int searchElement = inp.nextInt();

        int count = 0;

        for (int i = 0 ; i < arr.length;i++)
        {
            if(arr[i] == searchElement)
            {
                count = i;

            }

        }
        if(count == 0)
        {
            System.out.println(searchElement + "is not present its position = -1");
        }
        else
        {
            System.out.println(searchElement +"'s position = "+count);
        }
    }
}
