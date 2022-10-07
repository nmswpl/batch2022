package in.co.nmsworks.exercise2;
//print the biggest of the 3 numbers
public class BiggestNumber
{
    public static void main(String[] args)
    {
        int number1 = 12;
        int number2 = 24;
        int number3 = 25;
        if (number1 > number2 && number1 > number3)
        {
            System.out.println(number1 + " is the Largest");
        }
        else if (number2 > number1 && number2 > number3)
        {
            System.out.println(number2 + " is the Largest");
        }
        else
        {
            System.out.println(number3 + " is the Largest");
        }
    }
}
