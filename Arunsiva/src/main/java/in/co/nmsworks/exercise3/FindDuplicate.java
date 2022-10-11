package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) throws Exception {

        List<Integer> val = BufferReader.Readfile("/home/nmsadmin/Downloads/Numbers.txt");

        Set<Integer> duplicates= new HashSet<>();
        int count=0;

                for(Integer num:val)
                if(duplicates.contains(num))
                {
                    System.out.println(num+"duplicate, ");
                    count++;

                }
                else
                {
                    duplicates.add(num);
        }
        System.out.println(count);
        System.out.println(val.size());

    }




}





