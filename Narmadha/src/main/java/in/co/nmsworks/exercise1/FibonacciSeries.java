package in.co.nmsworks.exercise1;

public class FibonacciSeries {
    //Display Fibonacci Series Using for Loop
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int count=10;
        System.out.print(n1+ " "+n2+" ");

        for(int i=2;i<count;i++){
           int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print( n3+" ");

        }

    }
}
