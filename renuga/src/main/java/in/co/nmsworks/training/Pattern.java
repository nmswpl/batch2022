package in.co.nmsworks.training;

public class Pattern {
    public static void main(String[] args) {
        int size = 5;
        char ch='a';


        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(ch+i));
            }
            System.out.println();
        }
    }
}
