package in.co.nmsworks.exercise3;

import java.util.*;

public class OccurrenceToNumbers {
    public static Map<Integer, List<Integer>> sortedOrderOfOccurrence(Map<Integer,Integer> numToNumCount)
    {
        Map<Integer,List<Integer>> occurrenceToNumbers = new HashMap<>();

        Set<Integer> keyItem = numToNumCount.keySet();


        for (int item : keyItem)
        {
            int key = numToNumCount.get(item);
            if(occurrenceToNumbers.containsKey(key))
            {
                occurrenceToNumbers.get(key).add(item);

            }
            else
            {
                List<Integer> values = new ArrayList<>();
                values.add(item);
                occurrenceToNumbers.put(key,values);
            }
        }

        return occurrenceToNumbers;

    }
}
