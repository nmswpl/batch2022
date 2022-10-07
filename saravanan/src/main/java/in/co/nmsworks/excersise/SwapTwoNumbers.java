package in.co.nmsworks.excersise;

public class SwapTwoNumbers
{
    public static void main(String[] args)
    {
        int swap1 = 50;
        int swap2 = 100;
        int temp = 0;
        System.out.println("before swap "+swap1+" "+swap2);
        temp = swap1;
        swap1 = swap2;
        swap2 = temp;
        System.out.println("after swap "+swap1+" "+swap2 );
    }
}
