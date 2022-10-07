package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class CheckAlphabet {
    public static void main(String[] args) {
        char alpha;
        Scanner inputObject=new Scanner(System.in);
        alpha=inputObject.next().charAt(0);
        if(alpha>='a'&& alpha<='z'||alpha>='A'&& alpha<='Z')
        {
            System.out.println(alpha+" is an alphabet");
        }
        else
        {
            System.out.println(alpha+" is not an alphabet");
        }
    }
}

