// 24. Write a program to find Frequency of Character
import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter Statement : ");
        String statement = input.nextLine();
        //String statement = "This website is awesome";
        for(int i=0;i<statement.length();i++){
            if(statement.charAt(i)=='e'){
                count++;
            }
        }
        System.out.println("ABC of e = "+count);
    }
}
