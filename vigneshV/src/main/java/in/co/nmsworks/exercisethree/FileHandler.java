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
        FindOccurrence.occurrenceCount(numbers);
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
