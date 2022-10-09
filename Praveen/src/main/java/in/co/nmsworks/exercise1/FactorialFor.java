//program to Find Factorial of a number using for loop
public class FactorialFor {

    public void printFact(int number)
    {
        int fact=1;
        for(int i=1;i<number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of 10="+fact);
    }

    public static void main(String[] args) {
        FactorialFor exe13=new FactorialFor();
        exe13.printFact(10);
    }
}
