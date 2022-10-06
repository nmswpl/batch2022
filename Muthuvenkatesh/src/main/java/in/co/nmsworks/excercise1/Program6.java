// 6. Write a program to Swap two numbers using temporary variable
public class Program6 {
    public static void main(String[] args) {
        float num1 = 1.2f;
        float num2 = 2.45f;
        float temp;
        System.out.println("--Before Swap");
        System.out.println("First number = "+num1);
        System.out.println("Second number = "+num2);
        System.out.println("--After Swap--");
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First number = "+num1);
        System.out.println("Second number = "+num2);

    }
}
