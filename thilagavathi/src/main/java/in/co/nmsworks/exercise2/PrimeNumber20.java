//program for prime number or not(20)
//input:num=7,10;

package in.co.nmsworks.exercise2;

public class PrimeNumber20 {
    public static void main(String[] args) {
       // int num=7;
        int num = 10;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

