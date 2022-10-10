// to print the multiplication table of 5(15)

package in.co.nmsworks.exercise1;

public class MultiplicationTable15 {
    public static void main(String[] args) {
        int m, n = 5;
        for (int i = 1; i <= 10; i++) {
            m = n * i;
            System.out.println( n + "*" + i + "=" +m);
        }
    }
}
