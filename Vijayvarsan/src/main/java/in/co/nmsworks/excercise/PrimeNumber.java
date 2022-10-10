package in.co.nmsworks.excercise;

public class PrimeNumber {
    //21. Write a program to Check Prime Number using a for loop
    public static void main(String[] args) {
        System.out.println("FIND PRIME NUMBER USING FOR LOOP");
        int find=44 , flag=0;

        for (int i=2;i<find/2;i++)
        {
            if ( find%i==0 )
            {
                flag++;
                break;
            }
        }
        if(flag==0)
            System.out.println("ITS A PRIME NUMBER");
        else
            System.out.println("NOT A PRIME NUMBER");
    }
}
