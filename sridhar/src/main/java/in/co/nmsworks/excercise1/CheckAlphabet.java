package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class CheckAlphabet {
    public static void main(String[] args) {
        char alphabet;
        Scanner inputObject=new Scanner(System.in);
        alphabet=inputObject.next().charAt(0);
        if(alphabet>='a'&& alphabet<='z'||alphabet>='A'&& alphabet<='Z')
        {
            System.out.println(alphabet+" is an alphabet");
        }
        else
        {
            System.out.println(alphabet+" is not an alphabet");
        }
    }
}
