package in.co.nmsworks.excersise2;

public class Excersise10
{
    public static void main(String[] args)
    {
        for(int i=200;i<=500;i++)
        {
            int temp = i% 10;
            if(temp == 7)
            {
                System.out.println(" "+i);
            }
        }
    }
}

