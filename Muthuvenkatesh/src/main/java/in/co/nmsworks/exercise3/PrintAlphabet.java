package in.co.nmsworks.exercise3;
import java.util.Scanner;

public class PrintAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int number = input.nextInt();
        number = 96+number;
        char ch = (char)number;
        for(char i='a';i<ch;i++){
            for(char j='a';j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
