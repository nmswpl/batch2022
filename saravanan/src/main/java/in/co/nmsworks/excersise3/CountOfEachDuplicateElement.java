package in.co.nmsworks.excersise3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOfEachDuplicateElement
{
    public Map<Integer,List<Integer>> countOfEachDuplicate(List<Integer> duplicateList)
    {

        Map<Integer,Integer> duplicateCount = new HashMap<>();
        Map<Integer, List<Integer>> dupCount = new HashMap<>();

        for (Integer temp : duplicateList)
        {
            if (duplicateCount.containsKey(temp))
            {
                int value = duplicateCount.get(temp) + 1;
                duplicateCount.put(temp,value);
            }
            else
            {
                duplicateCount.put(temp,1);
            }

        }
        for (Integer temp : duplicateCount.keySet())
        {

              if(dupCount.containsKey(duplicateCount.get(temp)))
              {
                  dupCount.get(duplicateCount.get(temp)).add(temp);

              }
              else
              {
                  List<Integer> tep =new ArrayList<>();
                  tep.add(temp);
                  dupCount.put(duplicateCount.get(temp),tep);
              }

        }
        return dupCount;
    }
}
