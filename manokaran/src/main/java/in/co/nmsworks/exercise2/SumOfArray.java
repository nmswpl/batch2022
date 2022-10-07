package in.co.nmsworks.exercise2;
// sum of the elements of the array.
public class SumOfArray
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3};
        int sumOfArray = 0;
        for (int number: array)
        {
            sumOfArray += number;
        }
        System.out.println("Sum of elements in the array : " + sumOfArray);
    }

}
