public class Fibonacci {

    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int num=10;
        int sum = 0;
        System.out.print(num1+ " " +num2);

        for (int i=0 ; i<num;i++){

            sum = num1+num2;
            System.out.print(" "+sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
