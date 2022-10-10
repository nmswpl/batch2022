package in.co.nmsworks.excercise2;

public class SumOfArray
{
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int sum = 0;

        for( int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        System.out.println("Output = "+sum);
    }
}
