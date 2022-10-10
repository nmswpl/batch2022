package in.co.nmsworks.training.excercise1;

public class FactorialForLoop {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        for (int i = 1; i < num + 1; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial of "+num+ " is " + fact);
    }
}
