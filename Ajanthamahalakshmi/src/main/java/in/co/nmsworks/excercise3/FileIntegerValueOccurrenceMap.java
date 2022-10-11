package in.co.nmsworks.excercise3;

import noOccurrenceMap.Entry;

import java.util.*;

public class FileIntegerValueOccurrenceMap {

    public static void main(String[] args) throws Exception {
        String filePath = "/home/nmsadmin/Downloads/Numbers.txt";
        List<Integer> originalIntegerList = new ArrayList<>(FileRead.readFileAsInt(filePath));
        System.out.println(" Original List : " + originalIntegerList);

        Map<Integer, Integer> noOccurrenceMap = new HashMap<>();

        // 1, 2, 1, 3,4, 5, 3

        for (int i : originalIntegerList) {
            int count = 0;
            for (int j : originalIntegerList) {
                if (i == j) {
                    count++;
                }

            }
            noOccurrenceMap.put(i, count);

        }

        System.out.println("Map : " + noOccurrenceMap);

        System.out.println("------------------------------------------------------------------------------");

//


//        for(int value : noOccurrenceMap.values())
        {


            Map<Integer, List<Integer>> countKeyMap = new HashMap<>();

            for (Map.Entry<Integer, Integer> entry : noOccurrenceMap.entrySet())
            {
                if (countKeyMap.containsKey(entry.getValue()))
                {

                    List<Integer> keyList = countKeyMap.get(entry.getValue());
                    keyList.add(entry.getKey());

                } else {
                    List<Integer> keyList = new ArrayList<>();
                    keyList.add(entry.getKey());
                    countKeyMap.put(entry.getValue(), keyList);
                }

            }
            System.out.println("Counted Key Value Map : "+countKeyMap);
        }

        }


        }

//        System.out.println(keyList);




