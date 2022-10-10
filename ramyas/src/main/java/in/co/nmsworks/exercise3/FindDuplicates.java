package in.co.nmsworks.exercise3;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates
{
    public static void main(String[] args) throws IOException {
        List<Integer> list = ReadFile.fileReader("/home/nmsadmin/Numbers.txt");

        Set<Integer> list1 = new HashSet<>();

        for (int i:list)
        {
            if (list1.contains(i))
            {
                System.out.println("duplicates "+i);

            }
            else
            {
                list1.add(i);
            }
        }


    }
}
