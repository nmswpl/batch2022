package in.co.nmsworks.exercise2;
//Write a Program to check whether x is Prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        int number=1;
        int count=0;

        if(number%2==0)
        {
            count++;
            System.out.println("Not a Prime Number");
        }
        if(count==0)
        {
            System.out.println("Prime Number");
        }
    }
}
