package in.co.nmsworks.exercisetwo;

public class EndSeven
{
    public static void main(String[] args)
    {
        for(int i=200;i<500;i++)
        {
            int n = i%10;
            if(n==7)
                System.out.println(i);
        }
    }
}
