package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class PrintHundredPositionValueInWords
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a 3 digit number : ");
        int number = inp.nextInt();
        int digitheck = number;
        String[] words = {"Zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        int count = 0;
        while(true)
        {
            if(digitheck == 0)
            {
                break;
            }
            else
            {
                digitheck = digitheck/10;
                count++;

            }


        }
        if (count == 3)
        {
            int ans = number / 100;
            System.out.println(words[ans]);
        }
        else
        {
            System.out.println("Please Enter a 3 digit number");
        }

    }
}
