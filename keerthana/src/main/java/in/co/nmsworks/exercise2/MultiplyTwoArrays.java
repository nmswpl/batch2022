/*3. Write a program to multiply two arrays of same size element-by-element.
E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7

 */


package in.co.nmsworks.exercise2;

public class MultiplyTwoArrays
{
    public static void main(String[] args)
    {
        int[] arr1={2,4,1,5,7,14};
        int[] arr2={3,5,7,45,67,43};
        int temp=0;

        for(int i=0;i< arr1.length;i++)
        {
            temp=arr1[i] * arr2[i];
            System.out.print(temp+" ");

        }

    }
}
