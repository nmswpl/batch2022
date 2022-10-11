package in.co.nmsworks.exercise3;
// print no of times the number is in the file

import java.io.IOException;
import java.util.*;

public class FrequencyOfNumber
{
    public static void main(String[] args) throws IOException
    {
        String filepath = "/home/nmsadmin/Downloads/Numbers.txt";
        Map<Integer, Integer> numToNumCount = new HashMap<>();
        List<Integer> listOfNumbers = FileParsing.read(filepath);
        for (Integer num : listOfNumbers)
        {
            if (numToNumCount.containsKey(num)){
                numToNumCount.put(num, numToNumCount.get(num) + 1);
            }
            else {
                numToNumCount.put(num, 1);
            }
        }
        System.out.println(numToNumCount);

        Map<Integer,List<Integer>> noOf = new HashMap<>();
        Set<Integer> values = new HashSet<>();
        values.addAll(numToNumCount.values());

        for(Integer integer:values)
        {
            List<Integer> list = new ArrayList<>();
            for (Integer number:numToNumCount.keySet())
            {
                if(numToNumCount.get(number) == integer)
                {
                    list.add(number);
                }
            }
            noOf.put(integer,list);
        }
        for(Integer num:noOf.keySet())
        {
            System.out.println(num + " : " + noOf.get(num));
        }


    }
}
