package in.co.nmsworks.excersice4;

public class TriangleProgram {
    public static void main(String[] args) {
        char ch='a';
        int number=5;
        for (int i=0;i<number;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}
