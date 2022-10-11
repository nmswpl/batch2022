package in.co.nmsworks.exercise;
//12. Write a program to find the Sum of Natural Numbers using for loop
public class SumOfNumber {
    public static void main(String[] args) {
        int Sum = 0;
        for (int i = 0; i <=100; i++)
        {
            Sum = Sum+i;
        }
        System.out.println("Sum of Natural Number : "+Sum);
    }
}
