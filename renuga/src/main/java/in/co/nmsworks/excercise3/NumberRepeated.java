package in.co.nmsworks.excercise3;

import java.util.*;

import static in.co.nmsworks.excercise3.NumberOccurrenceComputer.countOfNumbers;

public class NumberRepeated {
    public static Map<Integer, List<Integer>> sortedOrderOfOccurrence(Map<Integer, Integer> numToNumCount) {
        Map<Integer, List<Integer>> occurrenceToNumbers = new HashMap<>();

        Set<Integer> keyItem = numToNumCount.keySet();


        for (int item : keyItem) {
            int key = numToNumCount.get(item);
            if (occurrenceToNumbers.containsKey(key)) {
                occurrenceToNumbers.get(key).add(item);

            } else {
                List<Integer> values = new ArrayList<>();
                values.add(item);
                occurrenceToNumbers.put(key, values);
            }
        }

        return occurrenceToNumbers;

    }

    public static void main(String[] args) {
        List<Integer> intputList = FileParsing.readFileAndGetIntList("/home/nmsadmin/Downloads/Numbers.txt");
        HashMap<Integer,Integer> numToNumCount = countOfNumbers(intputList);
        Map<Integer,List<Integer>> resultSet= NumberRepeated.sortedOrderOfOccurrence(numToNumCount);

       System.out.println(resultSet);
    }
    }
