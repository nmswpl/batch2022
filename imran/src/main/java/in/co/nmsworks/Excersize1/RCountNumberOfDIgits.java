import java.util.Scanner;

public class RCountNumberOfDIgits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        int count = 0;

        while(true)
        {
            if(number == 0)
            {
                break;
            }
            else
            {
                number = number/10;
                count++;
          
            }
           
        
        }
        System.out.println("Number of digits : "+count);
    }
}
