package in.co.nmsworks.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static in.co.nmsworks.exercise3.DuplicateNumber.duplicateNumber;

public class CountElement
{
    public static Map<Integer,Integer> countInteger( List<Integer> list) throws Exception
    {
        int value;
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        Map<Integer,List<Integer>> elementlist=new HashMap<>();

        for (int i = 0; i < list.size(); i++)
        {

            if (numberCountMap.containsKey(list.get(i)))
            {
                 value=numberCountMap.get(list.get(i));
                value++;
                //numberCountMap.put(list.get(i), value);
            }
            else {
                numberCountMap.put(list.get(i), 1);
            }
        }
        System.out.println(numberCountMap);



        for(Integer a : numberCountMap.keySet())
        {
            Integer temp = numberCountMap.get(a);
            if(elementlist.containsKey(temp))
            {
                elementlist.get(temp).add(a);

            }
            else
            {
                List<Integer> element=new ArrayList<>();
                element.add(a);
                elementlist.put(temp,element);
            }
        }
        System.out.println(elementlist);


        return numberCountMap;
    }

    public static void main(String[] args) throws Exception
    {

        FileRead file = new FileRead();
        List<Integer> list = file.fileRead("/home/nmsadmin/Downloads/Numbers.txt");
        duplicateNumber(list);
        countInteger(list);
    }

}
