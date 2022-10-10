/*14. Given an array of String, Write a Program to reverse the array and print.
For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}*/
package in.co.nmsworks.exercisesets2;

import java.util.Arrays;

public class ReverseOfArray14 {
    public static void main(String[] args) {

        String[] array={"sujitha","thilaga","divya","renuga"};
        System.out.println("original string is : "+ Arrays.toString(array));


        int start=0;
        int length=array.length;
        int end=length-1;
        String temp;

        for (int i=0;i<length/2;i++)
        {
            temp=array[i];
            array[i]=array[end];
            array[end]=temp;
            end--;

        }
        System.out.println("reverse of string is: "+Arrays.toString(array));






    }
}
