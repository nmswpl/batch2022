package in.co.nmsworks.excersise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementCount
{
    public Map<Integer,List<Integer>>  countInteger(List<Integer> list)
    {
        Map<Integer,Integer> countElenemt = new HashMap<>();
        Map<Integer,List<Integer>> countOfEachElement=new HashMap<>();
        for (Integer temp : list)
        {
            if (countElenemt.containsKey(temp))
                countElenemt.put(temp, countElenemt.get(temp) + 1);
            else
            {
                countElenemt.put(temp,1);
            }
        }
        for (Integer a : countElenemt.keySet())
        {
            if (countOfEachElement.containsKey(countElenemt.get(a)))
            {
                countOfEachElement.get(countElenemt.get(a)).add(a);
            }
            else
            {
                List<Integer> list2 = new ArrayList<>();
                list2.add(a);
                countOfEachElement.put(countElenemt.get(a), list2);
            }
        }
        return countOfEachElement;
    }




}
