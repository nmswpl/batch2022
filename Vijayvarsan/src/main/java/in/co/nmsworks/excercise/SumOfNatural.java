package in.co.nmsworks.excercise;

public class SumOfNatural {
    //12. Write a program to find the Sum of Natural Numbers using for loop
    public static void main(String[] args) {
        int naturalNum=100;
        int sum=0;
        for(int i=0;i<=naturalNum;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of Natural number is = "+sum);
    }
}
