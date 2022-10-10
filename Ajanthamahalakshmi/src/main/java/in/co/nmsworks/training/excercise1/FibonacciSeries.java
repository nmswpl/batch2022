package in.co.nmsworks.training.excercise1;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        int num =10,prev = 0, current =1, next;
        System.out.println(prev);
        System.out.println(current);
        for(int i=2; i <= num; i++)
        {
            next = prev + current;
            System.out.println(next);
            prev = current;
            current = next;

        }


    }
}
