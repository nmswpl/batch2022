package in.co.nmsworks.exercise2;

public class PrintOddElements
{
    public static void main(String[] args)
    {
        int[] arr={1,34,54,23,67,44,87,56};
        int count=0;
            for (int i = 0; i < arr.length; i++) {

                    if (arr[i] % 2 != 0) {
                        System.out.print(arr[i]+" ");
                        count++;
                    }
                }


        System.out.println("\nOdd numbers count in array: "+count);

    }
}
