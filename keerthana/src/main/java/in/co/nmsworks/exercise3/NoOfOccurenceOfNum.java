package in.co.nmsworks.exercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoOfOccurenceOfNum
{
    public static Map<Integer,Integer> NoOfOccurence(List<Integer> list)
    {
        Map<Integer,Integer> mapObject=new HashMap<>();
        for(int i:list)
        {
            if(mapObject.containsKey(i))
            {
               int count= mapObject.get(i);
               mapObject.put(i,count+1);
            }
            else
            {
                mapObject.put(i,1);
            }
        }
        return mapObject;
    }
}
























