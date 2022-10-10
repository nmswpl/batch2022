package in.co.nmsworks.exercise2;
import java.util.Arrays;

public class SquareOfEveryElement {
    //program to print the square of every element present in the array.
    public static void main(String[] args) {
        int[]arr={2,4,3,5};

        int square[]=new int[4];
        for(int i=0;i< arr.length;i++){

            square[i]=arr[i]*arr[i];



        }
        System.out.println(Arrays.toString(square));




        }
    }

