package in.co.nmsworks.exercise1;

public class SwapNumbers6 {
    public static void main(String[] args) {
        double a= 1.2;
        double b= 2.45;
        double temp;

        System.out.println("----before swap-----");
        System.out.println("First number is:"+a);
        System.out.println("Second number is:"+b);

        temp=a;
        a = b;
        b = temp;

        System.out.println("----after swap-----");
        System.out.println("First number is:"+a);
        System.out.println("Second number is:"+b);





    }
}
