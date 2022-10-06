public class problem6 {

    //Write a program to Swap two numbers using temporary variable


    public static void main(String[] args) {
        int a,b,temp;
        a=10;
        b=20;
        System.out.println("Before Swap");
        System.out.println("First Number "+a);
        System.out.println("Second Number "+b);
        temp=a;
        a=b;
        b=temp;

        System.out.println("After Swap");
        System.out.println("First Number "+a);
        System.out.println("Second Number "+b);


    }
}
