package in.co.nmsworks.Excersice3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static in.co.nmsworks.Excersice3.ReadFile.readfile;

public class FindDuplicatesInAFile
{
    public static List<Integer> findDuplicates(List<Integer> originallist)
    {
        List<Integer> withoutDuplicate = new ArrayList<>();
        List<Integer> duplicateOnly = new ArrayList<>();


        for (int i : originallist)
        {
            if(duplicateOnly.contains(i))
            {
                withoutDuplicate.add(i);
            }
            else
            {
                duplicateOnly.add(i);
            }
        }
        System.out.println("Non Duplicate List : "+withoutDuplicate);

        return duplicateOnly;
    }

}
