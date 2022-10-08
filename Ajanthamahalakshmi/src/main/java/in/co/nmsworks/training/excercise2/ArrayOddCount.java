//15. Given an array of integers, Write a Program to count and print even elements.
// For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3 Reason : 2 4 & 6 are even
package in.co.nmsworks.training.excercise2;

public class ArrayOddCount {
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 5, 6};
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0; i< arr.length; i++)
        {
            if(i%2==0)
            {
               evenCount++;
                System.out.println("These are even"+arr[i]);
            }
            else{
                oddCount++;
                System.out.println("These are odd"+arr[i]);
            }
        }
        System.out.println("even count"+evenCount);
        System.out.println("odd count"+oddCount);
    }
}
