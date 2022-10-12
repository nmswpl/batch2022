package in.co.nmsworks.excercise3;
import java.util.Scanner;

public class AlphabetPatten {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter");
            int n = sc.nextInt();
            int i, j;
            for (i = 0; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print((char) (96 + i));
                }
                System.out.println();
            }

        }

}
