package in.co.nmsworks.excercise2;

public class FactorialRecursion {
    public static void main(String[] args) {
        FactorialRecursion fr=new FactorialRecursion();
        int factNumber=5;
        int result=fr.factorial(factNumber);
        System.out.println(result);
    }
    public int factorial(int factNumber)
    {
        if(factNumber==0)
        {
            return 1;
        }
        else
        {
            return factNumber*factorial(factNumber-1);
        }
    }
}
