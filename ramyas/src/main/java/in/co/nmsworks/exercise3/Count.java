package in.co.nmsworks.exercise3;

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
//            for (int j:list1)
//            {
//                if(i==j)
//                    count++;
//            }
            else
              countdigit.put(i,1);
        }
        System.out.println(countdigit);
    }
}

