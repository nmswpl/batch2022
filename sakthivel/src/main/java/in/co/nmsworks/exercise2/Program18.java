package in.co.nmsworks.exercise2;

import java.util.Arrays;

public class Program18
{
public static void printHundredPositionValue()
{
    int num=455;
    String[] arr={ " ","one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        while (num != 0)
        {
            num = num / 100;
            for(int i=0;i< arr.length-1;i++)
            {

              if (num == i) {
                System.out.println(arr[i]);
             }

            }
    }
}

    public static void main(String[] args)
    {
        printHundredPositionValue();
    }
}
