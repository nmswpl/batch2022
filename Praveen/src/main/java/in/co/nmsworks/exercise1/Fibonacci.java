//Fibonacci Series Using for Loop
public class Fibonacci {
    public void printFib(int first,int second,int count)
    {
        System.out.println(first);
        System.out.println(second);
        for(int i=2;i<count;i++)
        {
            int third=first+second;
            first=second;
            second=third;
            System.out.println(third);
        }

    }

    public static void main(String[] args) {
        Fibonacci exe16=new Fibonacci();
        exe16.printFib(0,1,10);
    }

}
