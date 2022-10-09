package in.co.nmsworks.Excersice2;

public class PrintNumberOfOddElements
{
    public static void main(String[] args)
    {
        int[] arr = {32, 43, 4, 15};
        int count = 0;

        String str = " Reason : ";
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
            }
            else
            {
                str = str +  " " +i ;
            }
        }
        System.out.println("Odd elements = " +count);
        System.out.println("Reason "+str+" or odd");

    }
}
