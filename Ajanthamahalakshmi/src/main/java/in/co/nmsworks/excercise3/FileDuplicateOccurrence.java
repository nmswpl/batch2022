package in.co.nmsworks.excercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileDuplicateOccurrence {
    public static Map<Integer, Integer> occurrence(List<Integer> originalList, List<Integer> duplicateList)
    {
        Map<Integer,Integer> noOccurrenceMap = new HashMap<>();

        for (int i : originalList)
        {
            int count = 0;
            for(int j : duplicateList)
            {
                if(originalList.indexOf(i) == duplicateList.indexOf(j))
                {
                    count++;
                }

            }
            if(count >= 1)
            {
                noOccurrenceMap.put(i, count);
            }

        }
        return noOccurrenceMap;
    }
}
