package in.co.nmsworks.excercise2;
// find and print the factorial of a number
public class Program16 {
    public static int findFact(int n) {
        if(n == 1) {
            return 1;
        }
        return n * findFact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = " + findFact(n));
    }
}
