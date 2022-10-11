package in.co.nmsworks.excercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccuranceOfNumbersInList {

    public static void main(String[] args) {
        List<Integer> numbersList = FileReader.readFileAndParseAsNumbers("/home/nmsadmin/Downloads/Numbers.txt");
        OccuranceOfNumbersInList repeatCount = new OccuranceOfNumbersInList();
        Map<Integer,Integer> result=repeatCount.findRepeatcount(numbersList);
        System.out.println("Map Key Values"+result);
        System.out.println("Map size = "+result.size());
    }

    public Map<Integer,Integer> findRepeatcount(List<Integer> numberList)
    {
        Map<Integer,Integer> countRepeat = new HashMap<>();


        for ( Integer num : numberList)
        {
            if (countRepeat.containsKey(num))
            {
                countRepeat.put(num,countRepeat.get(num)+1);
            }
            else
            {
                countRepeat.put(num,1);
            }
        }

        return countRepeat;
    }
}
