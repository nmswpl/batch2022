//To find position of the element in the array(4)
//input:arr={7,15,41}

package in.co.nmsworks.exercise2;
import java.util.Scanner;

public class PositionOfElement4 {

    public  void main(String[] args) {
        int findPosition;
        int arr[] = {7, 15, 41};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("search Element:");
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            if (t != arr[i]) {
            }

            else {
                System.out.println("The position is:" + arr[i]);
            }
        }
    }
}






