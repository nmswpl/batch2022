package in.co.nmsworks.excercise2;

public class CountAndPrintEven
{
    public static void main(String[] args) {
        int[] numbers = { 2,3,4,5,6};
        int even = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 2 == 0 )
            {
                even++;
                System.out.println("The even numbers is "+numbers[i]);

            }
        }
        System.out.println("The number of even numbers is "+even);
    }
}
