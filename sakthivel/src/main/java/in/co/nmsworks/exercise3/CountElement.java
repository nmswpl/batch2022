package in.co.nmsworks.exercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static in.co.nmsworks.exercise3.DuplicateNumber.duplicateNumber;

public class CountElement
{
    public static Map<Integer,Integer> CountInteger( List<Integer> list) throws Exception
    {
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++)
        {

            if (numberCountMap.containsKey(list.get(i)))
            {
                int value=numberCountMap.get(list.get(i));
                value++;
                numberCountMap.put(list.get(i), value);
            }
            else
            {
                numberCountMap.put(list.get(i), 1);

            }
        }
        System.out.println(numberCountMap);
        return numberCountMap;
    }

    public static void main(String[] args) throws Exception {

        FileRead file = new FileRead();
        List<Integer> list = file.fileRead("/home/nmsadmin/Downloads/Numbers.txt");
        duplicateNumber(list);
        CountInteger(list);
    }

}
