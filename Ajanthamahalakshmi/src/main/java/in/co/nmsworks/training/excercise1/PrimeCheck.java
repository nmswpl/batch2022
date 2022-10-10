package in.co.nmsworks.training.excercise1;

public class PrimeCheck {
    public static void main(String[] args) {
        int x = 26;
        int count = 0;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                count++;
            }

        }
        if (count > 1) {
            System.out.println (x+"  not prime");
        }
        else {
            System.out.println(x+"  prime");
        }

    }
}
