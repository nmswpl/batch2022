package in.co.nmsworks.excersice2;

public class OddElementInArray {

    //12. Given an array of integers, Write a Program to print number of odd elements.
    //For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
    //are odd.

    public static void main(String[] args) {
        int[] arr={32, 43, 4, 15};
        int element=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                element++;
            }
        }
        System.out.println(element);
    }
}
