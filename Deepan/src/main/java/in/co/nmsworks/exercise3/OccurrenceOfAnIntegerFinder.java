package in.co.nmsworks.exercise3;

import java.util.*;

public class OccurrenceOfAnIntegerFinder {

    public static Map<Integer, Integer> occurrenceOfAnInteger(List<Integer> numberList) {

        Map<Integer, Integer> numToNumCount = new HashMap<>();
        for (Integer num : numberList) {
            if (numToNumCount.containsKey(num)) {
                Integer numCount = numToNumCount.get(num);
                numToNumCount.put(num, numCount + 1);
            } else {
                numToNumCount.put(num, 1);
            }
        }
        System.out.println(numToNumCount);
        return numToNumCount;

    }
}
