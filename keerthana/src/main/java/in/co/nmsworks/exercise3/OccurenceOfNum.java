package in.co.nmsworks.exercise3;

import java.util.*;

public class OccurenceOfNum {
    public static Map<Integer, List<Integer>> occurenceOfNumbers(Map<Integer, Integer> mapSet)
    {

        Map<Integer, List<Integer>> noOfOccur = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : mapSet.entrySet()) {
            if (noOfOccur.containsKey(entry.getValue()))
            {
                List<Integer> list1 = noOfOccur.get(entry.getValue());
                list1.add(entry.getKey());

            }
            else
            {
                List<Integer> list1 = new ArrayList<>();
                list1.add(entry.getKey());
                noOfOccur.put(entry.getValue(), list1);
            }
        }
        return noOfOccur;
    }

}

