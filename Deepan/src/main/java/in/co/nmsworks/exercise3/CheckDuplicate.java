package in.co.nmsworks.exercise3;

import java.util.*;

public class CheckDuplicate {
    public void checkDuplicates(List<Integer> arrayList)
    {
        Set<Integer> uniqueSet = new HashSet<>();

        int duplicateCount =0 ;

        for (int i=0 ; i < arrayList.size() ; i++)
        {
            int item = arrayList.get(i);
            if(uniqueSet.contains(item))
            {
                System.out.println(item + " is Duplicate");
                duplicateCount++;
            }
            else
            {
                uniqueSet.add(item);
            }
        }
        System.out.println("duplicateCount : "+duplicateCount);
    }

    public static void main(String[] args) {
        CheckDuplicate instance = new CheckDuplicate();
        List<Integer> abc = FetchData.readFileAndGetIntList("/home/nmsadmin/Downloads/Numbers.txt");
        instance.checkDuplicates(abc);
    }
}
