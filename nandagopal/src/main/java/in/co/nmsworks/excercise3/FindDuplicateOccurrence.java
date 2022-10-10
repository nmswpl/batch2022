package in.co.nmsworks.excercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 1 1 1 2 3
// 1 - [2, 3]
// 3 - [1]

public class FindDuplicateOccurrence {
    public static void main(String[] args) {
        String filePath = "/home/nmsadmin/Desktop/Training/assetFiles/Numbers.txt";
        List<Integer> numbers = ReadContent.readFile(filePath);

        Map<Integer, Integer> numToFrq = new HashMap<>();

        for(Integer num : numbers) {
            if(numToFrq.containsKey(num)) {
                numToFrq.replace(num, numToFrq.get(num)+1);
            }
            else {
                numToFrq.put(num, 1);
            }
        }

        Map<Integer, List<Integer>> freqToNumbers = new HashMap<>();

        for(Integer num : numToFrq.keySet()) {
            Integer freqKey = numToFrq.get(num);

            if(freqToNumbers.containsKey(freqKey)) {
                freqToNumbers.get(freqKey).add(num);
                freqToNumbers.replace(freqKey, freqToNumbers.get(freqKey));
            }
            else {
                List<Integer> sameFreqNumbers = new ArrayList<>();
                sameFreqNumbers.add(num);
                freqToNumbers.put(freqKey, sameFreqNumbers);
            }
        }

        for (Integer key : freqToNumbers.keySet()) {
            System.out.println(key + " : " + freqToNumbers.get(key));
        }
    }
}
