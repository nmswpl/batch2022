public class problem12 {
    //Write a program to find the Sum of Natural Numbers using for loop

    public static void main(String[] args) {
        int num = 100, sum = 0;

        for(int i = 1; i <= num; i++)
        {
             sum = sum + i;

        }

        System.out.println("Sum of Natural number is" + sum);
    }
}

