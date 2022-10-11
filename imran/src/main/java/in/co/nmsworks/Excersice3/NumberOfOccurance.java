package in.co.nmsworks.Excersice3;

import java.util.*;

import static java.util.Map.*;

public class NumberOfOccurance
{
    public static void numberOfOccurance(List<Integer> orglist) {
        Map<Integer, Integer> mymap = new HashMap<>();

        for (int i : orglist) {
            int count = 0;
            for (int j : orglist) {
                if (i == j) {
                    count++;

                }
            }
            mymap.put(i, count);

        }

        Map<Integer,List<Integer>> ansmap = new HashMap<>();

        for (Map.Entry<Integer,Integer> entry : mymap.entrySet())
        {

            if(ansmap.containsKey(entry.getValue()))
            {
                List<Integer> listforOccurance = ansmap.get(entry.getValue());
                listforOccurance.add(entry.getKey());
            }
            else
            {
                List<Integer> listforOccurance = new ArrayList<>();
                listforOccurance.add(entry.getKey());
                ansmap.put(entry.getValue(),listforOccurance);

            }

        }
        System.out.println("Number of occurance  in map : " +ansmap);
        System.out.println("\n");

        //For Printing Map's values
        Set<Integer> myset = new HashSet<>(ansmap.keySet());
        for (int i : myset)
        {
            System.out.println(i +  " times = " +  ansmap.get(i));
        }
    }
}
