package in.co.nmsworks.exercise3;

import java.util.*;

public class CountOfDuplicateNumbers {
    public static void countDuplicates() throws Exception{
        List<Integer> list = ReadFile.fileRead("/home/nmsadmin/Downloads/Numbers.txt");
        Set<Integer> list1 = new HashSet<>();
        int count = 0;
        for (Integer integer : list) {
            if (list1.add(integer)) {

            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
