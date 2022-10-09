package in.co.nmsworks.excercise;

public class Fibonacci {
    //16. Display Fibonacci Series Using for Loop

    public static void main(String[] args) {
        System.out.println("FINBBONASSI SERIES");
        int first = 0;
        int second = 1;
        int number=10;
        int value;
        System.out.println(first);
        System.out.println(second);
        for (int i=0 ; i<number;i++)
        {
             value = first + second;
            first = second;
            second =value;
            System.out.println(value);
        }
    }
}
