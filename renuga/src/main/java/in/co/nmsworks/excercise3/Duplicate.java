package in.co.nmsworks.excercise3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    public void Duplicates(List<Integer> arrayList)
    {
        Set<Integer> uniqueSet = new HashSet<>();

        int duplicateCount =0 ;

        for (int i=0 ; i < arrayList.size() ; i++)
        {
            int item = arrayList.get(i);
            if(uniqueSet.contains(item))
            {
                duplicateCount++;
                System.out.println("duplicate is " + item );
            }
            else
            {
                uniqueSet.add(item);
            }
        }
        System.out.println("duplicate : " +  duplicateCount);
    }

    public static void main(String[] args) {
        Duplicate instance = new Duplicate();
        List<Integer> abc = FileParsing.readFileAndGetIntList("/home/nmsadmin/Downloads/Numbers.txt");
        instance.Duplicates(abc);
    }
}


