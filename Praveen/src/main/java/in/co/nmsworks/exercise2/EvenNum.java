package in.co.nmsworks.exercise2;

//print all even numbers between 601 and 700 in descending order.
public class EvenNum {
    public static void main(String[] args) {
        int number=601;
        for (int i = 700; i >=number ; i--)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
