package in.co.nmsworks.exercisetwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PositionOfElement {
    public static void main(String[] args) {
        int[] arr = {7, 15, 41};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find");
        int searchNum = sc.nextInt();
        boolean flag = false;
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(searchNum == arr[i])
            {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("At index "+i);
        else
            System.out.println("Not found -1");
    }
}
