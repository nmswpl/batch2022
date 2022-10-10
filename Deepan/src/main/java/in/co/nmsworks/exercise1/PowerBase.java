import java.util.Scanner;

public class PowerBase {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter base:");
        int base = get.nextInt();
        System.out.println("Enter power: ");
        int power = get.nextInt();

        int ans = 1;
        for(int i=0 ; i < power ; i++)
        {
            ans = ans*base;
        }
        System.out.println(ans);
    }
}
