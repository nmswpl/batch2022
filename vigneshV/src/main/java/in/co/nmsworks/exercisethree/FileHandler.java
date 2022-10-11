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
        Map<Integer,List<Integer>> noOfOccurance = new HashMap<>();
        Set<Integer> valuesSet = new HashSet<>(map.values());
        for(int i:valuesSet)
        {
            List<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer, Integer> j:map.entrySet())
            {
                if(j.getValue()==i) {
                    list.add(j.getKey());
                }
            }

            noOfOccurance.put(i,list);
        }
        System.out.println("\n"+noOfOccurance);
    }


    private static void searchDuplicate(List<Integer> numbers)
    {
        Set<Integer> duplicateNum = new HashSet<>();
        for(int i:numbers)
        {
            if(!duplicateNum.contains(i))
                duplicateNum.add(i);
            else
                System.out.print(" "+i);
        }
    }
}
