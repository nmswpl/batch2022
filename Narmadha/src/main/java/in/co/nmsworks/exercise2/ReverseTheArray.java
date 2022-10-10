package in.co.nmsworks.exercise2;
import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        //Given an array of String, Write a Program to reverse the array and print.
        String arr[] = {"a", "b", "c"};

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
