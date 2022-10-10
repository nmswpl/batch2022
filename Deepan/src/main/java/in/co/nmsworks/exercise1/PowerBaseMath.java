import java.util.Scanner;

//Finding base and power using math function
public class PowerBaseMath {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter base:");
        int base = get.nextInt();
        System.out.println("Enter power: ");
        int power = get.nextInt();

        double ans = Math.pow(base,power);
        System.out.println(ans);
    }
}
