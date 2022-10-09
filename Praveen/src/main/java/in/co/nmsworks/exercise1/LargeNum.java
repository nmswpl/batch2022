//program to Find Largest Among three numbers using if..else statement
public class LargeNum {

    public void printLargest(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println("a is the Largest Number");
        } else if (b>a && b>c)
        {
            System.out.println("b is the Largest Number");
        }
        else
        {
            System.out.println("c is the Largest Number");
        }
    }

    public static void main(String[] args) {
        LargeNum exe9=new LargeNum();
        exe9.printLargest(10,18,16);
    }
}
