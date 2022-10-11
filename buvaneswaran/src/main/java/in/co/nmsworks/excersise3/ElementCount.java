package in.co.nmsworks.excersise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementCount
{
    public Map<Integer,Integer> countInteger(List<Integer> list)
    {
        Map<Integer,Integer> countElenemt = new HashMap<>();
        for (Integer temp : list)
        {
            if (countElenemt.containsKey(temp))
                countElenemt.put(temp, countElenemt.get(temp) + 1);
            else
            {
                countElenemt.put(temp,1);
            }
        }
        return countElenemt;
    }

    public static void main(String[] args)throws Exception
    {
        FileReading fileHandling=new FileReading();
        List<Integer> result=fileHandling.readFile("/home/nmsadmin/Downloads/Numbers.txt");
        System.out.println(result);

        RemoveDuplicateInteger duplicateInteger=new RemoveDuplicateInteger();
        List<Integer> duplicate=duplicateInteger.duplicateElementRemove(result);
        System.out.println(duplicate);

        ElementCount countDuplicate=new ElementCount();
        Map<Integer,Integer> count=countDuplicate.countInteger(result);
        System.out.println(count);
    }
}
