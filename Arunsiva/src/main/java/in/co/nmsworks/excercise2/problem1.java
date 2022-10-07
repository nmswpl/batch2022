package in.co.nmsworks.excercise2;

public class problem1 {
    public static void main(String[] args) {
        System.out.print("even numbers from 600 to 700 in descending order : ");
        for (int i=700; i>=601; i--)
        {
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}


