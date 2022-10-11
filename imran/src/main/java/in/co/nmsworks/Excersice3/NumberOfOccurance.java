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

        for (Map.Entry<Integer,Integer> entry : mymap.entrySet())
        {
            List<Integer> listforOccurance = new ArrayList<>();
            if(!ansmap.containsKey(entry.getValue()))
            {

                ansmap.put(entry.getValue(),listforOccurance);

            }
            List<Integer> listforOccurance1 = ansmap.get(entry.getValue());
            listforOccurance1.add(entry.getKey());

        }
        System.out.println();
//        System.out.println(ansmap.get(1));
//        Set<Integer> myset = new HashSet<>(mymap.values());
//        for (int i : myset)
//        {
//
//            for (Map.Entry<Integer, Integer> entry : mymap.entrySet())
//            {
//                if(entry.getValue() == i)
//                {
//                    listforOccurance.add(entry.getKey());
//                }
//            }
//            ansmap.put(i,listforOccurance);
//            System.out.println("\n");
//            System.out.println(i+" time  = "+ansmap.get(i));
//        }
        System.out.println("\n");
        System.out.println("Counting in map : " +ansmap);

    }
}
