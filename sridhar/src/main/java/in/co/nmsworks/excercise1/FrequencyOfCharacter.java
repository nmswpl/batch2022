package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String statement;
        int count=0;
        char findChar;
        Scanner inputObject=new Scanner(System.in);
        statement=inputObject.nextLine();
        findChar=inputObject.next().charAt(0);
        for (int i=0; i<statement.length();i++)
        {
            if (statement.charAt(i)==findChar)
            {
                count++;
            }
        }
        System.out.println("ABC of "+findChar+" = "+count);
    }
}
