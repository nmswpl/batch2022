package in.co.nmsworks.exercise3;

import java.util.*;

public class PrintDuplicates {
    public static void main(String[] args) {
        String filePath="/home/nmsadmin/Downloads/Numbers.txt";
        ReadAFile readAFile = new ReadAFile();
        List<Integer>list=new ArrayList<>(readAFile.fileParse(filePath));
        System.out.println(list);
       findDuplicates(list);
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
        System.out.println(count);
    }

    public static Map<Integer,Integer> countTheNumbers(List<Integer>list)
    {
        Map<Integer,Integer> map =new HashMap<>();
        for (Integer temp:list) {

            if (map.containsKey(temp))
            {
                Integer count=map.get(temp);
                map.put(temp,count+1);

            }
            else {
                map.put(temp,1);
            }

        }
        System.out.println(map);

        return map;
    }

}
