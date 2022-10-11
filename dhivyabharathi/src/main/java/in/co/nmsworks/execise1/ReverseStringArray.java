package in.co.nmsworks.execise1;
//14. Given an array of String, Write a Program to reverse the array and print.
import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        String [] GivenArray = {"a","d","r","t"};
        String [] temp = new String[GivenArray.length];
        int i,j;
        for ( i = GivenArray.length-1 , j=0; i >=0 && j<GivenArray.length; i--,j++)
        {
            temp[j] = GivenArray[i];
        }
        System.out.println(Arrays.toString(temp));

    }
}
