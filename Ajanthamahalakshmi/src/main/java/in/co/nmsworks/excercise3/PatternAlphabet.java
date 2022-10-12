package in.co.nmsworks.excercise3;

public class PatternAlphabet {
    public static void main(String[] args) {

        int row = 7;
        for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print( (char) (i+64) );
            }
            System.out.println();
        }

    }
}