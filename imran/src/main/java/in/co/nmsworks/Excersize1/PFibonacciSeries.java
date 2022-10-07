public class PFibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0 , num2 =1 ,num3;
        System.out.print(num1 +", "+num2 +", ");
        for (int i = 0 ; i<8 ; i++)
        {
            num3 = num1 + num2;
            System.out.print(num3+", ");
            num1 = num2;
            num2 = num3;
        }
    }
}
