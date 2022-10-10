/*16. Display Fibonacci Series Using for Loop*/
package in.co.nmsworks.excercise1;

public class Fibonacci16 {
    public static void main(String[] args) {
        System.out.println("fibonacci series till 10 terms");
        int n1=0,n2=1;
        int n3,n=10;
        for(int i=0;i<10;i++)
        {
            System.out.print(" "+n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }

    }
}
