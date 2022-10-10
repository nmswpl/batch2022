package exercise2;

//Finding dividends of three
public class DividendsOfThree {

    public static void main(String[] args) {
        int num = 3;

        for (int i=300 ; i < 400 ; i++ )
        {
            if ( i % 3 == 0)
            {
                System.out.print(i + " " );
            }
        }
    }
}
