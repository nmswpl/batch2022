package in.co.nmsworks.exercisethree;

import java.util.*;

public class FindOccurrence {


    public static void occurrenceCount(List<Integer> numbers)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :numbers)
            map.put(i,map.getOrDefault(i,0)+1);
        Map<Integer,List<Integer>> noOfOccurance = new HashMap<>();
        Set<Integer> valuesSet = new HashSet<>(map.values());
        for(int i:valuesSet)
        {
            List<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer, Integer> j:map.entrySet())
            {
                if(j.getValue()==i) {
                    list.add(j.getKey());
                }
            }

            noOfOccurance.put(i,list);
        }
        System.out.println("\n"+noOfOccurance);
    }
}
