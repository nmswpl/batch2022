package in.co.nmsworks.excercise1;

/*Write a program to Swap two numbers using temporary variable*/
public class Swapping6 {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        System.out.println("before swapping ----->");
        System.out.println("a is "+a);
        System.out.println(("b is " + b));
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping------>");
        System.out.println("a is "+a);
        System.out.println(("b is " + b));
    }
}

