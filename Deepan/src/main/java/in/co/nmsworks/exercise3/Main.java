package in.co.nmsworks.exercise3;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Integer> elements = FetchData.readFileAndGetIntList("/home/nmsadmin/Downloads/Numbers.txt");

        Map<Integer, Integer> numToNumCount = OccurrenceOfAnIntegerFinder.occurrenceOfAnInteger(elements);

        Map<Integer,List<Integer>> resultSet= OccurrenceToNumbers.sortedOrderOfOccurrence(numToNumCount);

        System.out.println(resultSet);
    }
}
