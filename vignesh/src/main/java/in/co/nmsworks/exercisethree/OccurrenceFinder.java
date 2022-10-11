package in.co.nmsworks.exercisethree;

import java.io.IOException;
import java.util.*;

public class OccurrenceFinder {


    public static void main(String[] args) throws IOException {

        FileParser fileParser = new FileParser();
        List<Integer> integerList = fileParser.filePrint("/home/nmsadmin/Downloads/Numbers.txt");
        Map<Integer, Integer> integerMap = new HashMap<>();
        int occurrence = 1;
        for (Integer value : integerList) {  // 87 887 990 87

            if (integerMap.containsKey(value)) {
                integerMap.put(value, integerMap.get(value) + 1);

            } else {
                integerMap.put(value, occurrence);
            }

        }
        System.out.println(integerMap);

        Map<Integer,List<Integer>> occurrenceMap = new HashMap<>();
        for (int integer: integerMap.keySet()) {           // 90 = 1,80 = 2
            if (occurrenceMap.containsKey(integerMap.get(integer))) {
                occurrenceMap.get(integerMap.get(integer)).add(integer);
            }
            else {
                occurrenceMap.put(integerMap.get(integer),new ArrayList<>());
                occurrenceMap.get(integerMap.get(integer)).add(integer);

            }
        }
        System.out.println(occurrenceMap);
//        List<Integer> oneTimeOccurrence = new ArrayList<>();
//        List<Integer> twoTimeOccurrence = new ArrayList<>();
//        List<Integer> threeTimeOccurrence = new ArrayList<>();
//
//        for (int integer: integerMap.keySet()) {
//            if (integerMap.get(integer) == 1){
//                oneTimeOccurrence.add(integer);
//            } else if (integerMap.get(integer) == 2) {
//                    twoTimeOccurrence.add(integer);
//            }else if(integerMap.get(integer) == 3) {
//                     threeTimeOccurrence.add(integer);
//            }
//        }
//        occurrenceMap.put(1,oneTimeOccurrence);
//        occurrenceMap.put(2,twoTimeOccurrence);
//        occurrenceMap.put(3,threeTimeOccurrence);
//        System.out.println(occurrenceMap);
    }
}

