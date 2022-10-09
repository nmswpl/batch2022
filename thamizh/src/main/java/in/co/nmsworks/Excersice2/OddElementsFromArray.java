package in.co.nmsworks.Excersice2;

public class OddElementsFromArray {

    //12. Given an array of integers, Write a Program to print number of odd elements.
    //For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15

    public static void main(String[] args) {

        int arr[]={31,43,6,17,7,5,11};

        int count=0;

        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
