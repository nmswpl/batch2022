package in.co.nmsworks.excercise4;

public class pattenPrint {
    public static void main(String[] args) {
        int n = 10;
        int a = 'a';

        for(int i=a; i<(a+n); i++) {
            for(int j=a; j<=i; j++) {
                System.out.print((char)i + " ");
            }
            System.out.println();
        }
    }
}
