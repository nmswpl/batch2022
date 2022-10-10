/*7.Write a program to print the square of every element present in the array.
E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25

 */


package in.co.nmsworks.exercise2;

public class SquareOfElementInArray
{
    public static void main(String[] args)
    {
        int[] arr={2,3,4,5,6,7,8,9};
        int square;
        for(int i=0;i< arr.length;i++)
        {
            square=arr[i]*arr[i];
            System.out.print(square+"  ");
        }

    }
}
