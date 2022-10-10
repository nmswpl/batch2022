package in.co.nmsworks.excercise2;

public class EvenNumbers
{
    public static void main(String[] args)
    {

        int endint = 700;

        for(int i = 601; i <= endint; i ++ ){
            if(i % 2 == 0)
            {
                System.out.println(i+" is even");
            }
            else
            {
                System.out.println(i+" is odd");
            }
        }
    }
}
