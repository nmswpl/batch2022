package in.co.nmsworks.exercise2;

// Multiply Two Arrays
public class MultiplyTwoArrays
{
    public static void main(String[] args)
    {
        int[] array1 = {2,4,1};
        int[] array2 = {3,5,7};
        System.out.print("Multiply of two arrays : ");
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i] * array2[i] + "  ");
        }

    }
}
