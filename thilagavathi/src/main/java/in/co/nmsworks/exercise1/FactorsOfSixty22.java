//factors of 60

package in.co.nmsworks.exercise1;

public class FactorsOfSixty22 {
    public static void main(String[] args) {
        int num=60;
        for (int i = 1; i <=num; i++) {
            if (num % i == 0) {
                System.out.print(i +",");
            }
        }
    }
}
