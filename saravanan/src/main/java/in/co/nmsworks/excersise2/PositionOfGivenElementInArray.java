package in.co.nmsworks.excersise2;

public class PositionOfGivenElementInArray
{
    public static void main(String[] args)
    {
        int[] arr={7,15,41};
        int searchElement =41;
        int present =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == searchElement)
            {
               present=i;

            }
            else
            {
                present=-1;
            }
        }
        if(present!=-1)
        {
            System.out.println("Element  "+searchElement+" in "+present+" position ");
        }
        else
        {
            System.out.println("element"+searchElement+" is not in arr"+present);
        }

    }
}
