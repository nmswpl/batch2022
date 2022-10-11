package in.co.nmsworks.excercise3;

import java.util.*;


public class CountOccurence {
    public static Map<Integer, Integer> findOccurence(List<Integer> integers) {
        Map<Integer, Integer> occurence = new HashMap<>();

        for (int number : integers) {
            if (occurence.containsKey(number)) {
                occurence.put(number, occurence.get(number) + 1);
            } else {
                occurence.put(number, 1);
            }
        }

        Map<Integer, List<Integer>> occurenceOfElements = new LinkedHashMap<>();

        for ( Map.Entry<Integer, Integer> element : occurence.entrySet())
        {
            int elementvalue = element.getValue();
            if(occurenceOfElements.containsKey(elementvalue))
            {
              List<Integer> values = occurenceOfElements.get(elementvalue);
               values.add(element.getKey());
//               occurenceOfElements.put(elementvalue,values);
            }
            else
            {
                List<Integer> values = new ArrayList<>();

                values.add(element.getKey());
                occurenceOfElements.put(elementvalue,values);
            }
        }

        System.out.println("Occurence of Elements = "+occurenceOfElements);
        return occurence;
    }


}