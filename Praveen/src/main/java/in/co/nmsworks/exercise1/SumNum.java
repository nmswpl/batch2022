//program to find the Sum of Natural Numbers using for loop
public class SumNum {

    public  void printSum(int number)
    {
        int sum = 0;
        for(int i=0;i<=number;i++)
        {
            sum+=i;
        }
        System.out.println(""+sum);
    }

    public static void main(String[] args) {
        SumNum exe12=new SumNum();
        exe12.printSum(100);
    }
}
