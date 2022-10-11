package in.co.nmsworks.excersise3;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateInteger
{
    public List<Integer> duplicateElementRemove(List<Integer> list)
    {
        List<Integer> newList = new ArrayList<>();
        for (Integer temp : list)
        {
            if (newList.contains(temp))
                continue;
            else
                newList.add(temp);
        }
        return newList;
    }
}
