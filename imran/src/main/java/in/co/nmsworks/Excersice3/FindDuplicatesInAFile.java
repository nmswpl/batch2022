package in.co.nmsworks.Excersice3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static in.co.nmsworks.Excersice3.ReadFile.readfile;

public class FindDuplicatesInAFile
{
    public static Set<Integer> findDuplicates(List<Integer> originallist)
    {
        List<Integer> withoutduplicates = new ArrayList<>();
        Set<Integer> duplicates = new HashSet<>();


        for (int i : originallist)
        {
            if(withoutduplicates.contains(i))
            {
                duplicates.add(i);
            }
            else
            {
                withoutduplicates.add(i);
            }
        }
        return duplicates;
    }

}
