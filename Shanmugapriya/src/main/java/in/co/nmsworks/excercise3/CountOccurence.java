package in.co.nmsworks.excercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurence
{
    public static Map<Integer,Integer> findOccurence(List<Integer> integers) {
        Map<Integer, Integer> occurence = new HashMap<>();

        for (int number : integers)
        {
            if (occurence.containsKey(number))
            {
                occurence.put(number,occurence.get(number)+1);
            }
            else
            {
                occurence.put(number, 1);
            }
        }

        return occurence;

    }
}
