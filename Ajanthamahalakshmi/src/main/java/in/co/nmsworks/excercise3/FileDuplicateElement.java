package in.co.nmsworks.excercise3;

import java.util.*;

public class FileDuplicateElement {
    public static List<Integer> findDuplicate(List<Integer> originalIntegerList)
    {
//        5 3 4 3 2 1 4
        Set<Integer> IntegerSet = new HashSet<>();
        List<Integer> duplicateIntegerList = new ArrayList<>();
//        Map<Integer,Integer> countOccurrenceMap = new HashMap<>();
        int count = 1;
        for (int i:originalIntegerList)
        {

            if(!IntegerSet.contains(i))
            {

                IntegerSet.add(i);

            }
            else
            {
                duplicateIntegerList.add(i);
                count++;
//                countOccurrenceMap.put(i, count+1);
            }


        }


        System.out.println(" Count of Duplicate Integer Value List : " + count);
        return duplicateIntegerList;
    }
}
