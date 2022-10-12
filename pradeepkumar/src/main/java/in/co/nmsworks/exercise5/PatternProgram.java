package in.co.nmsworks.exercise5;

public class PatternProgram {
    public static void main(String[] args) {
        int ascii =97;
        for (int i = 0; i <5; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print((char) ascii);
            }
            ascii++;
            System.out.println();
        }
    }
}




