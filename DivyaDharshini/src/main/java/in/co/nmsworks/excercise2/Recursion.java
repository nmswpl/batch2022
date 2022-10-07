package in.co.nmsworks.excercise2;

public class Recursion {

        public static int factorial(int n){
            if (n == 0)
                return 1;
            else
                return(n * factorial(n-1));
        }
        public static void main(String[] args){
            int fact;
            int number=5;
            fact = factorial(number);
            System.out.println("Factorial of "+number+" is: "+fact);
        }
}
