package in.co.nmsworks.execise1;
//18. Given an array of integers and int x, Write a Program to print no of occurance of x in
//the array
import java.util.Scanner;

public class OccurenceArray {
    public static void main(String[] args) {
        int GivenArray[] = {1,2,3,1,2,3,2,2,4,5};
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the No");
        int CheckNo = in.nextInt();
        for (int i = 0; i < GivenArray.length; i++) {
            if (CheckNo == GivenArray[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
