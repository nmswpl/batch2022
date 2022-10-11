package in.co.nmsworks.excercise2;

/*20. Given an integer x, Write a Program to check whether x is Prime or not ?
        E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime*/

public class Prime20 {
    public static void main(String[] args) {
        int num = 29;
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

