package in.co.nmsworks.training.excercise2;

public class EvenNoDescending {

    public static void main(String[] args) {
        for( int i =699; i>600 && i<700; i--)
        {
            if(i%2 == 0)
            {
                System.out.println("Even number between 600 to 700 in Descending Order"+i);
            }
        }
    }
}
