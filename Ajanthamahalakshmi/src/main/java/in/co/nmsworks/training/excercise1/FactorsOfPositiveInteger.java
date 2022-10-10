package in.co.nmsworks.training.excercise1;

public class FactorsOfPositiveInteger {
    public static void main(String[] args)
    {
        int num = 60;
        System.out.println("These are  the factors of "+num+ " : ");
        for(int i = 1; i <= num; i++)
        {
            if(num%i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
