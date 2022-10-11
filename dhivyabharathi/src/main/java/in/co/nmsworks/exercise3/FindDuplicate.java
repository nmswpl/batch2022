package in.co.nmsworks.exercise3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    Set<Integer> countset = new HashSet<>();
    int count=0;
    public void duplicate(List<Integer> rclist) {
        
        for (int i = 0; i < rclist.size(); i++)
        {
            for (int j = i + 1; j < rclist.size(); j++)
            {
                if (rclist.get(i).equals(rclist.get(j)))
                {
//                    System.out.print(rclist.get(i)+" ");
//                    countset.add(rclist.get(i));
                    count++;
                    System.out.println(rclist.get(j)+" "+count);
                    count = 0;

                }
            }
        }
//        int n=0;
//        for (int sample: count) {
//            for (int i = 0; i < rclist.size(); i++)
//            {
//                if(sample== rclist.get(i))
//                {
//                    n++;
//                    System.out.println(rclist.get(i) +" times "+n);
//                }
//            }
//
//        }
//        System.out.println(".............");
//        Set<Integer> store = new HashSet<>();
//        for (int num : list1)
//        {
//            if (store.add(num) == false) {
//                System.out.print(num +" ");
//            }
//        }

    }
}

