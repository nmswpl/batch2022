package in.co.nmsworks.training.program.exercise;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int num = 10;
        int multiplication = 1;
        for (int i = 1; i <= num; i++)
        {
            multiplication = 5 * i;
            System.out.println(" 5 * "+i+" ="+multiplication);
        }
    }
}
