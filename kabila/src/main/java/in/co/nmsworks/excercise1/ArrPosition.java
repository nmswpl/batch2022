package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class ArrPosition {
    public static void main(String[] args) {
        int arr1[] = {5, 6, 7};
        Scanner elmt = new Scanner(System.in);
        System.out.println("Enter the number 5 to 10");
        int number = elmt.nextInt();
        int position = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == number)
            {
                position=i;
                //System.out.println(index);
            }
        }
        System.out.println(position);
    }

}