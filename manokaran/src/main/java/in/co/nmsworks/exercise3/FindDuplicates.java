package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// print the duplicate elements in the file

public class FindDuplicates
{
    public static void main(String[] args) throws IOException
    {

        String filepath = "/home/nmsadmin/Downloads/Numbers.txt";
        List<Integer> listOfNumbers = FileParsing.read(filepath);
        Set<Integer> numberSet = new HashSet<>();
        List<Integer> duplicateElements = new ArrayList<>();
        for (Integer number : listOfNumbers)
        {
            if (numberSet.contains(number))
            {
                duplicateElements.add(number);
            }
            else
            {
                numberSet.add(number);
            }
        }
        System.out.println(duplicateElements);
    }
}
