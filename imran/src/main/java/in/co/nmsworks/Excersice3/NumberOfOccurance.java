package in.co.nmsworks.Excersice3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfOccurance
{
    public static void numberOfOccurance(List<Integer> orglist,List<Integer> duplist)
    {
        Map<Integer,Integer> mymap = new HashMap<>();

        for(int i : duplist)
        {
            int count = 0;
            for (int j : orglist)
            {
                if(i == j)
                {
                    count ++;

                }
            }
            mymap.put(i,count);
        }
        System.out.println(mymap);
    }
}
