package in.co.nmsworks.Excersice2;



public class PrintTheMultiplicationTable
{
    public static void main(String[] args) {
        int number = 17;

        for(int i = 1; i <=10 ; i++)
        {
            int mul = number * i;
            System.out.println(number + " * "  + i + " = " +mul);
        }
    }
}
