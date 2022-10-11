package in.co.nmsworks.exercisethree;



import java.io.IOException;
import java.util.*;

public class FileHandler
{
    public static void main(String[] args) throws IOException
    {
        ReadFile filereader = new ReadFile();
        List<Integer> numbers = new ArrayList<>(filereader.fileParser("/home/nmsadmin/Downloads/Numbers.txt"));
        findRepeatedNumbers(numbers);
        FindOccurrence.occurrenceCount(numbers);
    }


    private static void findRepeatedNumbers(List<Integer> numbers)
    {
        Set<Integer> repeatedNumbers = new HashSet<>();
        for(int i:numbers)
        {
            if(!repeatedNumbers.contains(i))
                repeatedNumbers.add(i);
            else
                System.out.print(" "+i);
        }
    }
}
