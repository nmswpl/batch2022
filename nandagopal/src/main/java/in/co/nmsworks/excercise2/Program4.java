package in.co.nmsworks.excercise2;

import java.util.Scanner;

// print the position of given element in an array. If not present, print -1
public class Program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {7, 15, 41};

        System.out.print("[ ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println(']');

        System.out.println("Enter element in the array to find position : ");
        int searchElement = in.nextInt();

        for(int i=0; i<arr.length; i++) {
            if(searchElement == arr[i]) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);





    }
}
