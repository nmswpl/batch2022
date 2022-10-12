package in.co.nmsworks.exercise3;

import java.util.*;

public class PrintDuplicates {
    public static void main(String[] args) {
        String filePath="/home/nmsadmin/Downloads/Numbers.txt";
        ReadAFile readAFile = new ReadAFile();
        List<Integer>list=new ArrayList<>(readAFile.fileParse(filePath));
        System.out.println(list);
       countTheNumbers(list);
    }

    public static void findDuplicates(List<Integer>list)
    {
        Set<Integer>set=new HashSet<>();
        int count=0;
        for (int i = 0; i <list.size() ; i++) {
            if (set.contains(list.get(i)))
            {
                count++;

            }
            else
            {
                set.add(i);
            }

        }
        System.out.println("count = "+count);
    }

    public static void countTheNumbers(List<Integer>list)
    {
        Map<Integer,Integer> map =new HashMap<>();
        for (Integer temp:list) {

            if (map.containsKey(temp))
            {

                map.put(temp,map.get(temp)+1);

            }
            else {
                map.put(temp,1);
            }

        }


        Map<Integer, List<Integer>> listMap = new HashMap<>();
        Set<Integer> keySet = map.keySet();
        for (Integer key: map.keySet()) {

            if (listMap.containsKey(map.get(key))) {
                listMap.get(map.get(key)).add(key);
            } else {
                List<Integer> mapList = new ArrayList<>();
                mapList.add(key);
                listMap.put(map.get(key), mapList);
            }

        }
        System.out.println(listMap);
    }


}
