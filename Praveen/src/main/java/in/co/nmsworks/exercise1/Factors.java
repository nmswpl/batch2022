//program to find Factors of a Positive Integer
public class Factors {
    public void printFactor(int n)
    {
        for (int i = 1; i <=n ; i++) {
            if(n % i==0)
            {
                System.out.print(i+" ");
            }

        }
    }

    public static void main(String[] args) {
        Factors exe22=new Factors();
        exe22.printFactor(60);
    }
}
