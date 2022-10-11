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
        List<Integer> oneTime = new ArrayList<>();
        List<Integer> twoTime = new ArrayList<>();
        List<Integer> threeTimes = new ArrayList<>();
        List<Integer> fourTimes = new ArrayList<>();
        for(int i :numbers)
            map.put(i,map.getOrDefault(i,0)+1);
        for (Map.Entry<Integer,Integer> i: map.entrySet())
        {
            if(i.getValue()==1)
                oneTime.add(i.getKey());
            else if(i.getValue()==2)
                twoTime.add(i.getKey());
            else if(i.getValue()==3)
                threeTimes.add(i.getKey());
            else if(i.getValue()==4)
                fourTimes.add(i.getKey());

        }
        System.out.println("\nOne Time Found - "+oneTime);
        System.out.println("Two Time Found - "+twoTime);
        System.out.println("Three Time Found - "+threeTimes);
        System.out.println("Four Time Found - "+fourTimes);
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
