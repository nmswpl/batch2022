package exercise2;

//Printing even numbers between 601 to 700 in desending order
public class EvenNumbers {

    public static void main(String[] args) {
        for (int i=700 ; i >= 601 ; i-- )
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }

}
