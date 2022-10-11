package in.co.nmsworks.exercisethree;

import java.util.*;

public class FindOccurrence {


    public static void occurrenceCount(List<Integer> numbers)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :numbers)
            map.put(i,map.getOrDefault(i,0)+1);
        Map<Integer,List<Integer>> noOfOccurance = new HashMap<>();
        for(Map.Entry<Integer, Integer> j:map.entrySet())
        {
            if(!noOfOccurance.containsKey(j.getValue()))
                noOfOccurance.put(j.getValue(),new ArrayList<>());
            noOfOccurance.get(j.getValue()).add(j.getKey());
        }

            System.out.println("\n"+noOfOccurance);
        }

    }

