package in.co.nmsworks.excercise2;

public class EndWithSeven {
    public static void main(String[] args) {
        int no1 = 200;
        int no2 = 500;
        for (int i = no1; i <= no2; i++) {
            if (i%10==7) {
                System.out.println(i);
            }
        }
    }
}
