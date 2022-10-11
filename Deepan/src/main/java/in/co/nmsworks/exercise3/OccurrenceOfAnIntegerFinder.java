package in.co.nmsworks.exercise3;

import java.util.*;

public class OccurrenceOfAnIntegerFinder {

    public static void occurrenceOfAnInteger(List<Integer> numbersList) {

        Map<Integer, Integer> numToNumCount = new HashMap<>();
        for (Integer num : numbersList) {
            if (numToNumCount.containsKey(num)) {
                Integer numCount = numToNumCount.get(num);
                numToNumCount.put(num, numCount + 1);
            } else {
                numToNumCount.put(num, 1);
            }
        }
        System.out.println(numToNumCount);
    }

    public static void main(String[] args) {
        List<Integer> elements = FetchData.readFileAndGetIntList("/home/nmsadmin/Downloads/Numbers.txt");
        occurrenceOfAnInteger(elements);

    }
}
