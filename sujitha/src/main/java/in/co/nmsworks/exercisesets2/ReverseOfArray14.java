/*14. Given an array of String, Write a Program to reverse the array and print.
For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}*/
package in.co.nmsworks.exercisesets2;

import java.util.Arrays;

public class ReverseOfArray14 {
    public static void main(String[] args) {

        String[] array={"sujitha","thilaga","divya","renuga"};
        System.out.println("reverse of array");
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("----------");

        for (int i=array.length-1;i>=0;i--)
        {
            System.out.println(array[i]);

        }

    }
}
