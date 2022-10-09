//program to Find Factorial of a number using for while loop
public class FactorialWhile {

    public void printFact(int number)
    {
        int fact=1;
        int i = 1;
        while( i<=number)
        {

            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of 5="+fact);
    }

    public static void main(String[] args) {
        FactorialWhile exe14=new FactorialWhile();
        exe14.printFact(5);
    }
}
