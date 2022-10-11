package in.co.nmsworks.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceToNumber {
    public static void occurenceToNumber() throws Exception{
        Map<Integer,Integer> map = CountOfOccurrence.countOccurrence();
        Map <Integer,List<Integer>> reverseMap = new HashMap<>();
        for(Integer num : map.keySet()) {
            int key = map.get(num);
            if (reverseMap.containsKey(key)) {
                reverseMap.get(key).add(num);
            }
            else {
                ArrayList<Integer> list1= new ArrayList<>();
                list1.add(num);
                reverseMap.put(key,list1);
            }
        }
        System.out.println(reverseMap);
    }
}
