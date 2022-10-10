package exercise2;

//Seven ending numbers between 200 to 500
public class SevenEndingNumbers {

    public static void main(String[] args) {
        int num = 7;

        for (int i=200 ; i < 500 ; i++)
        {
            int lastDigit = i % 10;
            if(lastDigit == num)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
