package in.co.nmsworks.exercisethree;

import java.io.IOException;
import java.util.*;

public class FileHandler
{
    public static void main(String[] args) throws IOException
    {
        ReadFile filereader = new ReadFile();
        List<Integer> numbers = new ArrayList<>(filereader.fileParser("/home/nmsadmin/Downloads/Numbers.txt"));
        searchDuplicate(numbers);
        findOccurrence(numbers);


    }


    private static void findOccurrence(List<Integer> numbers)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :numbers)
            map.put(i,map.getOrDefault(i,0)+1);
        for (Map.Entry<Integer,Integer> i: map.entrySet())
        {
            if(i.getValue()>1)
                System.out.println(i.getKey()+" ---- "+i.getValue());
        }
    }

    private static void searchDuplicate(List<Integer> numbers)
    {

        ArrayList<Integer> duplicateNum = new ArrayList<>();
        for(int i:numbers)
        {
            if(!duplicateNum.contains(i))
                duplicateNum.add(i);
            else
                System.out.print(" "+i);
        }

    }
}
