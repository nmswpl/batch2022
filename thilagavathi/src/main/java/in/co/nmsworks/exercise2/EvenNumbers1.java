//program for  to print even numbers
// between 600 and 700 in descending order(1)

package in.co.nmsworks.exercise2;

public class EvenNumbers1{
    static int num;

    public static void main(String[] args) {
        for (int i = 700; i >=600; i--) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
