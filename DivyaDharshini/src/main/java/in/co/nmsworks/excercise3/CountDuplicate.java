package in.co.nmsworks.excercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicate {
    public int countDuplicate(List<Integer> original)
    {
        Map<Integer,Integer> integerMap=new HashMap<>();
        for (int i : original) {
            int count = 0;
            for (int j : original) {
                if (i == j) {
                    count++;
                }
            }
            integerMap.put(i, count);
        }
        System.out.println("\nCount : "+integerMap);
        return integerMap.size();
    }
}
