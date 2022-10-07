package in.co.nmsworks.excercise2;
import java.util.Scanner;
public class PositionOfArrayElement {
    public static void main(String[] args) {
        int[] arr={7,15,41};
        int searchElement,flag=0;
        System.out.print("Search Element: ");
        Scanner inputObject=new Scanner(System.in);
        searchElement=inputObject.nextInt();
        for (int i=0; i< arr.length; i++)
        {
            if ( arr[i] == searchElement)
            {
                System.out.println("Output : "+i);
                flag=1;
            }
        }
        if (flag==0)
        {
            System.out.println("Output : -1");
        }
    }
}
