public class problem16 {
    //Display Fibonacci Series Using for Loop


    public static void main(String[] args) {
            int term = 10, a = 0, b = 1;
            System.out.println("Fibonacci Series of " + term + " terms:");

            for (int i = 1; i <= term; ++i)
            {
                System.out.print(a+ ", ");
                int c= a + b;
                a = b;
                b= c;
            }
    }
}
