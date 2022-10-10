package in.co.nmsworks.excersise3;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsInFile
{
    public List<Integer> duplicateElementRemove(List<Integer> duplicateList)
    {
        List<Integer> newList = new ArrayList<>();
        for (Integer temp : duplicateList)
        {
            if (newList.contains(temp))
                 continue;
            else
                newList.add(temp);
        }
        return newList;
    }
    }
