package in.co.nmsworks.Excersice3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static in.co.nmsworks.Excersice3.ReadFile.readfile;

public class FindDuplicatesInAFile
{
    public static List<Integer> findDuplicates(List<Integer> originallist)
    {
        List<Integer> duplicateOnly = new ArrayList<>();
        List<Integer> withoutDuplicate = new ArrayList<>();


        for (int i : originallist)
        {
            if(withoutDuplicate.contains(i))
            {
                duplicateOnly.add(i);
            }
            else
            {
               withoutDuplicate.add(i);
            }
        }

        return duplicateOnly;
    }

}
