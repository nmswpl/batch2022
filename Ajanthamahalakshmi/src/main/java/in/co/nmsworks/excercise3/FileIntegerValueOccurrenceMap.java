package in.co.nmsworks.excercise3;

import java.util.*;

public class FileIntegerValueOccurrenceMap
{

    public static void main(String[] args) throws Exception
    {
        String filePath = "/home/nmsadmin/Downloads/Numbers.txt";
        FileRead fr = new FileRead();
        List<Integer> originalIntegerList = new ArrayList<>(fr.readFileAsInt(filePath));
        System.out.println(" Original List : "+originalIntegerList);

        Map<Integer,Integer> noOccurrenceMap = new HashMap<>();

        // 1, 2, 1, 3,4, 5, 3

        for (int i : originalIntegerList )
        {
            int count = 0;
            for(int j : originalIntegerList)
            {
                if(i == j)
                {
                    count++;
                }

            }
            noOccurrenceMap.put(i,count);

        }

        System.out.println("Map : "+noOccurrenceMap);


    }
}
