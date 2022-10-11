package in.co.nmsworks.excercise3;

import java.util.*;

public class ReverseOccuranceOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbersList = FileReader.readFileAndParseAsNumbers("/home/nmsadmin/Downloads/Numbers.txt");
        OccuranceOfNumbersInList repeatCount = new OccuranceOfNumbersInList();
        Map<Integer,Integer> result=repeatCount.findRepeatcount(numbersList);
//        System.out.println("Map Key Values"+result);
//        System.out.println("Map size = "+result.size());

        ReverseOccuranceOfNumbers reverse=new ReverseOccuranceOfNumbers();
        Map<Integer,List> reverseMap = reverse.timesOfOccurance(result);
        System.out.println("Map Size = "+reverseMap.size());
        System.out.println(reverseMap);
    }

    public Map<Integer,List> timesOfOccurance(Map<Integer,Integer> countValuesMap)
    {
        Map<Integer,List> timesOfOccur=new HashMap<>();

        Set<Integer> keyValues = new HashSet<>(countValuesMap.values());

        for (Integer value : keyValues)
        {
            List<Integer> values=new ArrayList<>();

            for (Integer num : countValuesMap.keySet())
            {
                if (value.equals(countValuesMap.get(num)))
                 {
                     values.add(num);
                 }
            }

            timesOfOccur.put(value,values);

        }
        return  timesOfOccur;
    }
}
