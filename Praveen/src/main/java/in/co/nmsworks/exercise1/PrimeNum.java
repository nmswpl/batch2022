//program to Check Prime Number using a for loop
public class PrimeNum {
    public void printPrime(int number)
    {
        int count=0;
        for(int i=0;i<number/2;i++) {
            if (number % 2 == 0) {
                count++;
                System.out.println(number+" is not a Prime Number");
                break;

            }

        }

        if(count==0)
        {
            System.out.println(number+" is a Prime Number");
        }
    }

    public static void main(String[] args) {
        PrimeNum exe21=new PrimeNum();
        exe21.printPrime(29);
    }

}
