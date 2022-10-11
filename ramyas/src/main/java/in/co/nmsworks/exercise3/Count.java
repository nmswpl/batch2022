package in.co.nmsworks.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {
    public static void main(String[] args) {

        List<Integer> list1 = ReadFile.fileReader("/home/nmsadmin/Numbers.txt");
        Map<Integer,Integer> countdigit = new HashMap<>();


        for (int i:list1)
        {
            if(countdigit.containsKey(i))
            {
               countdigit.put(i,countdigit.get(i)+1);

            }

            else
              countdigit.put(i,1);
        }
       // System.out.println(countdigit);


        Map<Integer, List<Integer>> map = new HashMap<>();

        for (Map.Entry<Integer, Integer> i : countdigit.entrySet())
        {
            if (map.containsKey(i.getValue()))
            {
                map.get(i.getValue()).add(i.getKey());
            }
            else
            {
                List<Integer>list = new ArrayList<>();
                map.put(i.getValue(),list);
                map.get(i.getValue()).add(i.getKey());
            }
        }

        System.out.println("\n" +map );
    }
}

