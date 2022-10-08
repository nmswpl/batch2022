package in.co.nmsworks.training.excercise2;

public class ArrayOdd {
    public static void main(String[] args)
    {

        int[] arr = {4,7,2,3,9,8};
        int count = 0;
        int  res ;
        System.out.println("These are odd");
        for(int i=0;i< arr.length;i++)
        {
            if(i%2 != 0)
            {
                res = arr[i];

                System.out.println(res);
                count++;
            }
        }
        System.out.println("count of odd values :"+count);
    }
}
