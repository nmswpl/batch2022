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
        System.out.println("\n");
        System.out.println("Count : "+mymap);

        Map<Integer,List<Integer>> ansmap = new HashMap<>();
        Set<Integer> myset = new HashSet<>(mymap.values());

        for (int i : myset)
        {
            List<Integer> listforOccurance = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : mymap.entrySet())
            {
                if(entry.getValue() == i)
                {
                    listforOccurance.add(entry.getKey());
                }
            }
            ansmap.put(i,listforOccurance);
            System.out.println("\n");
            System.out.println(i+" time  = "+ansmap.get(i));
        }
        System.out.println("\n");
        System.out.println("Counting in map : " +ansmap);

    }
}
