package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static in.co.nmsworks.exercise3.FileParse.readTheFile;

public class FindingDuplicates {
    public static void main(String[] args){

        try {
            List<Integer>intList=readTheFile("/home/nmsadmin/Downloads/Numbers.txt");
            Set<Integer>duplicates=new HashSet<>();
            int count = 0;
            for (int num:intList)
            {
                if (duplicates.contains(num))
                {
                    System.out.println("duplicates "+num);
                    count++;

                }
                else
                {
                    duplicates.add(num);
                }
            }
            System.out.println(count);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
