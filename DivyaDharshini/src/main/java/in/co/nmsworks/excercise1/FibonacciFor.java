package in.co.nmsworks.excercise1;

public class FibonacciFor {
        public static void main(String[] args) {

            int n = 10, first = 0, second = 1;
            System.out.println("Fibonacci Series ");
            for (int i = 1; i <= n; ++i) {
                System.out.print(first + ", ");
                int nextTerm = first + second;
                first = second;
                second = nextTerm;
            }
        }
}
