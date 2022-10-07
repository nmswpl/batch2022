package in.co.nmsworks.training.excercise2;

public class Prime {
    public static void main(String[] args) {
        int x = 26;
        int count = 0;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                count++;
            }

        }
        if (count > 1) {
            System.out.println("  not prime");
        }
        else {
            System.out.println("  prime");
        }

    }
}
