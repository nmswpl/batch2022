package in.co.nmsworks.training.excercise2;

public class EndWith7 {

    public static void main(String[] args) {
        int value = 742;
        int res = value % 10;

        for (int i = 201; i > 200 && i < 500; i++) {
            if (i % 10 == 7) {
                System.out.println("Number End with 7 " + i);
            }
        }
    }
}
