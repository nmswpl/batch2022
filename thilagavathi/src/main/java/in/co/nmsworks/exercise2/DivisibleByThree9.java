//program for to print the numbers divisible by 3.(9)
//between 300 and 400

package in.co.nmsworks.exercise2;

public class DivisibleByThree9 {
    public static void main(String[] args) {
        System.out.println("Divided by 3: ");
        for (int i = 300; i <=400; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
    }
}
