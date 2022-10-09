package in.co.nmsworks.excersise;

import javax.management.monitor.StringMonitorMBean;
import java.util.Scanner;

public class FrequencyOfCharacter
{
    public static void main(String[] args)
    {
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter the  string");
        String character ="This website is awesome.";

      int count =0;
        for(int i=0;i<character.length();i++)
       {
            if(character.charAt(i) == 'e')
            {
                count++;
            }
        }
        System.out.println(count);

   }
}
