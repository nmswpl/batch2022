/*6. Write a program to Swap two numbers using temporary variable*/
package in.co.nmsworks.excercise1;

public class Swap6 {
    public static void main(String[] args) {
        int a=5,b=7;
        int temp;
        System.out.println("before swap a is: "+a+" , b is :"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swap a is: "+a+" , b is :"+b);
    }
}
