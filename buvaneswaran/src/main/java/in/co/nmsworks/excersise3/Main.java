package in.co.nmsworks.excersise3;

import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args)throws Exception
    {
        FileReading fileHandling=new FileReading();
        List<Integer> result=fileHandling.readFile("/home/nmsadmin/Downloads/Numbers.txt");
        System.out.println(result);

        RemoveDuplicateInteger duplicateInteger=new RemoveDuplicateInteger();
        List<Integer> duplicate=duplicateInteger.duplicateElementRemove(result);
        System.out.println(duplicate);

        ElementCount countDuplicate=new ElementCount();
        Map<Integer,List<Integer>> count=countDuplicate.countInteger(result);
        System.out.println(count);
    }
}
