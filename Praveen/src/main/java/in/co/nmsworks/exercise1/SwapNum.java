//program to Swap two numbers using temporary variable
public class SwapNum {

    public void printSwap(int a,int b)
    {
        System.out.println("--Before Swap--");
        System.out.println("Enter a value:"+a);
        System.out.println("Enter b value:"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("--After Swap--");
        System.out.println("Enter a value:"+a);
        System.out.println("Enter b value:"+b);
    }

    public static void main(String[] args) {
        SwapNum exe6=new SwapNum();
        exe6.printSwap(10,20);
    }
}
