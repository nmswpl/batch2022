package in.co.nmsworks.exercise2;

public class RecursionUsingFactorial {
    //recursion using factorial
    public static void main(String[] args) {
        int num=5;
        long factorial=multiplyNumbers(num);
        System.out.println(factorial);

    }
    public static long multiplyNumbers(int num){
        if (num>=1){
            return num*multiplyNumbers(num-1);
        }
        else{
            return 1;
        }
    }
}
