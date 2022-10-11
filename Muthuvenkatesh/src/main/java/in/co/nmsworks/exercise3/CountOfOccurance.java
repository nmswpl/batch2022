package in.co.nmsworks.exercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOfOccurance {
    public static void countOccurance() throws Exception{
        List<Integer> list = ReadFile.fileRead("/home/nmsadmin/Downloads/Numbers.txt");
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : list){
            if (map.containsKey(num))
            {
                Integer numCount = map.get(num);
                map.put(num, numCount+1);
            }
            else{
                map.put(num, 1);
            }
        }
        System.out.println(map);

    }
}
