package in.co.nmsworks.training.excercise1;

public class SwapTwoNumbers {
    public static void main(String[] args)
    {
        int a = 4,b = 6, temp;
        System.out.println("Before Swap : value of a is " +a+ " b is "+ b);
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap : value of a is " +a+ " b is "+ b);


    }
}
