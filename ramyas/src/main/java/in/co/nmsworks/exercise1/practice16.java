package in.co.nmsworks.exercise1;

public class practice16
{
    public static void main(String[] args) {
        int no = 10;
        int fn = 0;
        int sn = 1;


        for (int i = 0; i < no; i++)
        {
            System.out.println("Fibonacci series: " +fn);
            int nt = fn + sn;
            fn = sn;
            sn = nt;

        }

    }
}
