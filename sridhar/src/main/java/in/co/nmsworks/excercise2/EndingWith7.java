package in.co.nmsworks.excercise2;

public class EndingWith7 {
    public static void main(String[] args) {
        for (int i=200; i<=500; i++)
        {
            if ( i % 10 == 7 )
            {
                System.out.println(i);
            }
        }
    }
}
