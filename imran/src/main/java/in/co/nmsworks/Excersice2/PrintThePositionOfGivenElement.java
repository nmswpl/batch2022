package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class PrintThePositionOfGivenElement {
    public static void main(String[] args) {
        Scanner  inp = new Scanner(System.in);
        int[] arr = {7,15,41};

        System.out.print("Enter search Element : ");
        int searchElement = inp.nextInt();

        int position = 0;

        for (int i = 0 ; i < arr.length;i++)
        {
            if(arr[i] == searchElement)
            {
                position = i;
                break;

            }
            else
            {
                position = -1;
            }

        }
        System.out.println("Position  : "+position);
    }
}
