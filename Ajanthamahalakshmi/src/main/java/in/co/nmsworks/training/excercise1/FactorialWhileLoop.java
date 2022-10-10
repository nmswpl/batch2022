package in.co.nmsworks.training.excercise1;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        int i =1,num = 5,res =1;
        while(i<=num)
        {
            res *= i;
            System.out.println("Factorial using While Loop " + res);
            i++;
        }

    }
}
