package in.co.nmsworks.excercise2;
//multiplication of 17
public class Multiplicaton17
{
    public static void main(String[] args) {
        int number = 17;
        int multiples = 1;

        for ( int i = 1; i <= 10; i++)
        {
            multiples = number * i;
            System.out.println("17 * "+i+" = "+multiples);
        }
    }
}
