package in.co.nmsworks.exercise2;
// print the hundred position value in words
public class ThirdPos
{
    public static void main(String[] args)
    {
        int number=545;
        String[] arr={"","one","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for (int i = 0; i < arr.length ; i++)
        {
            int n = number / 100;
            if(n==i)
            {

                System.out.println(arr[i]);
            }

        }


    }
    }

