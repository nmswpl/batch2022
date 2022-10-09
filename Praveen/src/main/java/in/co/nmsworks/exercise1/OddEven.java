//whether a number is even or odd using if...else statement
public class OddEven {

    public void printOddEven(int number)
    {
        if(number%2==0)
        {
            System.out.println(number+" is Even");
        }
        else
        {
            System.out.println(number+" is Odd");
        }
    }

    public static void main(String[] args) {
        OddEven exe7=new OddEven();
        exe7.printOddEven(12);
    }
}
